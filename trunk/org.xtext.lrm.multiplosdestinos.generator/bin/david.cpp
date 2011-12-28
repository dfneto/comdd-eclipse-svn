/* ******************************************************************
 * Este código foi gerado automaticamente e desenvolvido originalmente por 
 * Gustavo Pessin (USP-ICMC-LRM). A DSL foi desenvolvida por David Fernandes 
 * Neto (USP-ICMC-Labes/Intermidia)
 * As alterações realizadas neste serão apagadas numa próxima geração	     
 * ******************************************************************
 */
//Cabecalho
#define BAUDRATE_GPS B19200
#define BAUDRATE_COMPASS B19200

#define PORTA_COMPASS "/dev/ttyUSB0"
#define PORTA_GPS "/dev/ttyUSB1"

#define NOME_ARQUIVO_LISTA_COORDENADAS "path.txt"
#define QTD_MAX_DESTINOS 50
FILE *arquivoDeCoordenadas;

#define _POSIX_SOURCE 1

#define PRINT_INFO_CHECKSUM 0
#define PRINT_NMEA_ORIGINAL 0
#define PRINT_LEITURA_SENSOR 1  // variaveis lidas tratadas
#define PRINT_BRAIN 1           // variaveis de calculos de acao
#define PRINT_ACAO 1            // variaveis de acao

/* *****************************************************************************
 * utm stuff (conversao de graus para utm, copiado do player)
 */

// WGS84 Parameters
#define WGS84_A     6378137.0           // major axis
#define WGS84_B     6356752.31424518    // minor axis
#define WGS84_F     0.0033528107        // ellipsoid flattening
#define WGS84_E     0.0818191908        // first eccentricity
#define WGS84_EP    0.0820944379        // second eccentricity

// UTM Parameters
#define UTM_K0      0.9996              // scale factor
#define UTM_FE      500000.0            // false easting
#define UTM_FN_N    0.0                 // false northing on north hemisphere
#define UTM_FN_S    10000000.0          // false northing on south hemisphere
#define UTM_E2      (WGS84_E*WGS84_E)   // e^2
#define UTM_E4      (UTM_E2*UTM_E2)     // e^4
#define UTM_E6      (UTM_E4*UTM_E2)     // e^6
#define UTM_EP2     (UTM_E2/(1-UTM_E2)) // e'^2



#include \<stdio.h>
#include \<stdlib.h>
#include \<string.h>
#include \<unistd.h>
#include \<math.h>
#include \<fcntl.h>
#include \<termios.h>
#include \<sys/stat.h>
#include \<time.h>
#include \<libplayerc/playerc.h>


//Pacotes
/* *****************************************************************************
 * Variaveis globais
 */
playerc_client_t *client;
playerc_position2d_t *position2d;

/* *****************************************************************************
 * inicializa player
 */

void inicializaPlayer()
{
    // Conecta ao servidor
    client = playerc_client_create(NULL, "localhost", 6665);
    if (playerc_client_connect(client) != 0) exit (0);
    
    // Conecta ao position (comando e odometria)
    position2d = playerc_position2d_create(client, 0);
    if (playerc_position2d_subscribe(position2d, PLAYERC_OPEN_MODE) != 0) exit (0);
    
    // Configura parametros
    if (playerc_client_datamode (client, PLAYERC_DATAMODE_PULL) != 0)
    {
        printf("Error: %s\n", playerc_error_str());
        exit (0);
    }
    
    // Configura parametros
    if (playerc_client_set_replace_rule (client, -1, -1, PLAYER_MSGTYPE_DATA, -1, 1) != 0)
    {
        printf("Error: %s\n", playerc_error_str());
        exit (0);
    }

    // Ativa os motores do robo
    playerc_position2d_enable(position2d, 1);
}



/* *****************************************************************************
 * testa checksun (copiado/adaptado do garminnmea.cc)
 * 
 * return 1 se deu ok
 * return -1 se deu pau
 */

int check_message(char mess[255])
{
    char* ptr2;
    char tmp[8];
    int chksum;
    int oursum;

    // verify the checksum, if present.  two hex digits are the XOR of all the
    // characters between the $ and *.

    if((ptr2 = strchr(mess,'*')) && (strlen(ptr2) == 3))

    //if((ptr2 = strchr((const char*)mess,'*')) && (strlen(ptr2) == 3))
    {
        strncpy(tmp,ptr2+1,2);
        tmp[2]='\0';
        chksum = strtol(tmp,NULL,16);
        
        oursum=0;
        for(int i=0;i\<(int)(strlen(mess)-strlen(ptr2));i++)
            oursum ^= mess[i];

        if(oursum != chksum)
        {
            if (PRINT_INFO_CHECKSUM==1) printf("\nCHECKSUM MISMATCH (0x%2x != 0x%2x); DISCARDING: [%s]",oursum, chksum, mess);
            mess = NULL;
            return -1;
        }
        else
        {
            *ptr2='\0';
        }
    }
    else
    {
        if (PRINT_INFO_CHECKSUM==1) printf("\nNO CHECKSUM: [%s]", mess);
        mess = NULL;
        return -1;
    }
    
    if (PRINT_INFO_CHECKSUM==1) printf("\nCHECKSUM OK (0x%2x == 0x%2x) [%s]", oursum, chksum, mess);

    return 1;
}
// my stuff to conversao de lat-long para utm (organizar na proxima versao)
double dUTM_E_X=0.0;
double dUTM_N_Y=0.0;
char sHemisferioLatitude[5] = "S";
char sHemisferioLongitude[5] = "W";

/* *****************************************************************************
 * Variaveis globais
 */
Destino destino[QTD_MAX_DESTINOS];

double dTorque = 0.0;
double dGiro = 0.0;

/* *****************************************************************************
 *  classe ("struct") que guarda pontos de destino
 */

class Destino
{
    public:

        double UTM_X_Leste_Oeste;
        double UTM_Y_Norte_Sul;
        int id_lido; /* vem do arquivo de coordenadas, quando o proximo eh -1
                      * o sistema pára */
};

/* *****************************************************************************
 * zera a lista de destinos, colocando -1 em todos os campos
 */

void zera_destinos()
{
    for (int i=0;i\<QTD_MAX_DESTINOS;i++)
    {
        destino[i].UTM_X_Leste_Oeste = -1.0;
        destino[i].UTM_Y_Norte_Sul = -1.0;
        destino[i].id_lido = -1;
    }
}

/* *****************************************************************************
 * leitura do arquivo de destinos
 */

void read_file_destinos()
{
    arquivoDeCoordenadas = fopen(NOME_ARQUIVO_LISTA_COORDENADAS,"rt");
    if (arquivoDeCoordenadas == NULL)
    {
        printf("\nNao achei arquivo %s\n", NOME_ARQUIVO_LISTA_COORDENADAS);
        exit(0);
    }

    int i=0;

    while(!feof(arquivoDeCoordenadas))
    {
        fscanf(arquivoDeCoordenadas,"%lf",&destino[i].UTM_X_Leste_Oeste);
        fscanf(arquivoDeCoordenadas,"%lf",&destino[i].UTM_Y_Norte_Sul);
        fscanf(arquivoDeCoordenadas,"%d",&destino[i].id_lido);
        i++;

        if (i >= QTD_MAX_DESTINOS)
        {
            printf("\nTamanho maximo atingido, aumente tamanho do vetor de destinos\n");
            exit (0);
        }
    }
}


/* *****************************************************************************
 * Imprime vetor (lido do arquivo de destinos)
 */

void imprime_destinos()
{
    for (int i=0;i\<QTD_MAX_DESTINOS;i++)
    {
        printf("I:%i \t X:%lf ",i, destino[i].UTM_X_Leste_Oeste);
        printf("\tY:%lf ",destino[i].UTM_Y_Norte_Sul);
        printf("\tID:%d\n",destino[i].id_lido);
    }
}


/* *****************************************************************************
 * azimute é o angulo para o alvo (considera angulo de bussola)
 *
 * exemplo de uso:
 * double origemX = 475000.00; double origemY = 220000.00;
 * double destinoX = 475010.00; double destinoY = 220010.00;
 * double res =  getAzimute(origemX, origemY, destinoX, destinoY);
 * std::cout \<\< "Res.: " \<\< res;
 */


double getAzimute(double destinoX, double destinoY, double origemX, double origemY)
{
    if (origemY==destinoY) destinoY += 0.0001;
    if (origemX==destinoX) destinoX += 0.0001;

    double AngR = atan((origemY-destinoY)/(origemX-destinoX));
    double AngG = (AngR/(2.0*M_PI))*360.0;

    /*
     * Isso é uma bússola de "verdade", 0 == norte [y]
     * e angulos aumentam em sentido horário
     */

    if ((destinoX\<origemX) && (destinoY\<origemY)) return (double) 360.0 - (90.0  + AngG);
    if ((destinoX>origemX) && (destinoY>origemY)) return (double) 360.0 - (270.0 + AngG);
    if ((destinoX>origemX) && (destinoY\<origemY)) return (double) 360.0 - (270.0 + AngG);
    if ((destinoX\<origemX) && (destinoY>origemY)) return (double) 360.0 - (90.0  + AngG);

    /* nunca entra aqui, mas... ;-) */
    return 0;
}



/* *****************************************************************************
 * Variaveis globais
 */

int iPortaGPS; // descritor da porta do GPS
GPS gps;

/* *****************************************************************************
 * classe ("struct") do gps
 */

class GPS
{
    public:

        // $GPGGA
        double  dUTC;
        double  dLatitudeY;
        char    sLatitudeY[20];
        double  dLongitudeX;
        char    sLongitudeX[20];
        int     iNumSat;
        //double  dAltitude;
        double  dDOP; // dilution of precision

        // $GPVTG
        double  dTrueCourse; // base no norte verdadeiro (bussola corrigida)
        double  dMagneticCourse; // base no norte magnetico (bussola normal)
        double  dSpeedKMH;

        // $PGRME
        double dHPE; // erro estimado horizontal (x,y)
        //double dVPE; // erro estimado vertical (h)
        //double dEPE; // estimed position error (x,y,h)
};



/* *****************************************************************************
 * abre porta do GPS
 */

void abreportaGPS()
{
    struct termios oldtio_gp,newtio_gp;

    iPortaGPS = open(PORTA_GPS, O_RDWR | O_SYNC | O_NONBLOCK, S_IRUSR | S_IWUSR );
    // iPortaGPS = open(PORTA_GPS, O_RDWR | O_NOCTTY );
    if (iPortaGPS \< 0) { printf("\nErro na porta %s\n\n", PORTA_GPS); exit(0); }
    tcgetattr(iPortaGPS,&oldtio_gp); // save current serial port settings
    bzero(&newtio_gp, sizeof(newtio_gp)); // clear struct for new port settings
    newtio_gp.c_cflag = BAUDRATE_GPS | CRTSCTS | CS8 | CLOCAL | CREAD;
    newtio_gp.c_iflag = IGNPAR | ICRNL;
    newtio_gp.c_oflag = 0;
    newtio_gp.c_lflag = ICANON;
    newtio_gp.c_cc[VINTR]    = 0;    
    newtio_gp.c_cc[VQUIT]    = 0;     
    newtio_gp.c_cc[VERASE]   = 0;   
    newtio_gp.c_cc[VKILL]    = 0;   
    newtio_gp.c_cc[VEOF]     = 4;    
    newtio_gp.c_cc[VTIME]    = 0;    
    newtio_gp.c_cc[VMIN]     = 1;     
    newtio_gp.c_cc[VSWTC]    = 0;    
    newtio_gp.c_cc[VSTART]   = 0;    
    newtio_gp.c_cc[VSTOP]    = 0;    
    newtio_gp.c_cc[VSUSP]    = 0;    
    newtio_gp.c_cc[VEOL]     = 0;    
    newtio_gp.c_cc[VREPRINT] = 0;    
    newtio_gp.c_cc[VDISCARD] = 0;    
    newtio_gp.c_cc[VWERASE]  = 0;    
    newtio_gp.c_cc[VLNEXT]   = 0;     
    newtio_gp.c_cc[VEOL2]    = 0;    
    tcflush(iPortaGPS, TCIFLUSH);
    tcsetattr(iPortaGPS,TCSANOW,&newtio_gp);
}



/* *****************************************************************************
 * Utility functions to convert geodetic to UTM position (original do player stage)
 */
 
int UTM(double lat, double lon)
{
     // constants
     const static double m0 = (1 - UTM_E2/4 - 3*UTM_E4/64 - 5*UTM_E6/256);
     const static double m1 = -(3*UTM_E2/8 + 3*UTM_E4/32 + 45*UTM_E6/1024);
     const static double m2 = (15*UTM_E4/256 + 45*UTM_E6/1024);
     const static double m3 = -(35*UTM_E6/3072);

     // compute the central meridian
     int cm = (lon >= 0.0) ? ((int)lon - ((int)lon)%6 + 3) : ((int)lon - ((int)lon)%6 - 3);
      
     // convert degrees into radians
     double rlat = lat * M_PI/180;
     double rlon = lon * M_PI/180;
     double rlon0 = cm * M_PI/180;

     // compute trigonometric functions
     double slat = sin(rlat);
     double clat = cos(rlat);
     double tlat = tan(rlat);

     // decide the flase northing at origin
     double fn = (lat > 0) ? UTM_FN_N : UTM_FN_S;

     double T = tlat * tlat;
     double C = UTM_EP2 * clat * clat;
     double A = (rlon - rlon0) * clat;
     double M = WGS84_A * (m0*rlat + m1*sin(2*rlat) + m2*sin(4*rlat) + m3*sin(6*rlat));
     double V = WGS84_A / sqrt(1 - UTM_E2*slat*slat);

     // compute the easting-northing coordinates
     dUTM_E_X = UTM_FE + UTM_K0 * V * (A + (1-T+C)*pow(A,3)/6 + (5-18*T+T*T+72*C-58*UTM_EP2)*pow(A,5)/120);
     dUTM_N_Y = fn + UTM_K0 * (M + V * tlat * (A*A/2 + (5-T+9*C+4*C*C)*pow(A,4)/24 + (61-58*T+T*T+600*C-330*UTM_EP2)*pow(A,6)/720));
     
     return 0;
}



/* *****************************************************************************
 * Parse the GPGGA sentence, which has lat/lon. (assassino!!!!!!!!!)
 * (fuçado do player stage)
 * $GPGGA,190059.8,2200.29878,S,04753.81201,W,1,10,0.9,827.9,M,-6.9,M,,*42
 */

int getUTM() 
{
    char field[32];
    char tmp[8];
    double degrees, minutes, arcseconds;
    double lat, lon;
    
    // latitude
    strcpy(field,gps.sLatitudeY); 
   
    strncpy(tmp,field,2);
    tmp[2]='\0';
    degrees = atoi(tmp);

    // next is minutes
    minutes = atof(field+2);
    arcseconds = ((degrees * 60.0) + minutes) * 60.0;
    
    strcpy(field,sHemisferioLatitude);
    
    if(field[0] == 'S') arcseconds *= -1;
    
    lat = arcseconds / 3600.0;
    
    strcpy(field,gps.sLongitudeX); 
    
    strncpy(tmp,field,3);
    tmp[3]='\0';
    degrees = atoi(tmp);
    
    // next is minutes
    minutes = atof(field+3);
    arcseconds = ((degrees * 60.0) + minutes) * 60.0;
    strcpy(field,sHemisferioLongitude);
   
    if(field[0] == 'W') arcseconds *= -1;
    
    lon = arcseconds / 3600.0;
    
    UTM(lat, lon);
    
    return 0;
}


/* *****************************************************************************
 * parser mensagem GPS GPVTG
 */

void quebraGPVTG(char frase[])
{
    char *tok;
    tok = strtok (frase,",");

    int pos=0;
    while (tok != NULL)
    {
        tok = strtok (NULL, ",");

        if (pos==0) { gps.dTrueCourse = atof (tok); }
        if (pos==2) { gps.dMagneticCourse = atof (tok); }
        if (pos==6) { gps.dSpeedKMH = atof (tok); }

        pos++;
    }
}

/* *****************************************************************************
 * parser mensagem GPS PGRME
 */

void quebraPGRME(char frase[])
{
    char *tok;
    tok = strtok (frase,",");

    int pos=0;
    while (tok != NULL)
    {
        tok = strtok (NULL, ",");
        
        if (pos==0) { gps.dHPE = atof (tok); }
        //if (pos==2) { gps.dVPE = atof (tok); }
        //if (pos==4) { gps.dEPE = atof (tok); }
        
        pos++;
    }
}

/* *****************************************************************************
 * parser mensagem GPS GPGGA
 */

void quebraGPGGA(char frase[])
{
    char *tok;

    tok = strtok (frase,",");

    int pos=0;
    while (tok != NULL)
    {
        tok = strtok (NULL, ",");

        if (pos==0) { gps.dUTC = atof (tok); }
	if (pos==1)
        {
            strcpy(gps.sLatitudeY,tok);
            gps.dLatitudeY = atof (tok);
        }
	if (pos==3)
        {
            strcpy(gps.sLongitudeX,tok);
            gps.dLongitudeX = atof (tok);
        }
        if (pos==6) { gps.iNumSat = atoi (tok); }
	//if (pos==8) { gps.dAltitude = atof (tok); }
	if (pos==7) { gps.dDOP = atof (tok); }
        
        pos++;
    }
}



/* *****************************************************************************
 * Variaveis globais
 */
int iPortaCompass; // descritor da porta do GPS
Compass compass;
/* *****************************************************************************
 * classe ("struct") da bussola
 */

class Compass
{
    public:

        double dHeading;
        char   sHeadingStatus[5];
        double dPitch;
        char   sPitchStatus[5];
        double dRoll;
        char   sRollStatus[5];
};




/* *****************************************************************************
 * abre porta Compass
 */
  
void abreportaCompass()
{
    struct termios oldtio_cp,newtio_cp;
    
    iPortaCompass = open(PORTA_COMPASS, O_RDWR | O_SYNC | O_NONBLOCK, S_IRUSR | S_IWUSR );
    // iPortaCompass = open(PORTA_COMPASS, O_RDWR | O_NOCTTY );
    if (iPortaCompass \< 0) { printf("\nErro na porta %s\n\n",PORTA_COMPASS); exit(0); }
    tcgetattr(iPortaCompass,&oldtio_cp); // save current serial port settings
    bzero(&newtio_cp, sizeof(newtio_cp)); // clear struct for new port settings
    newtio_cp.c_cflag = BAUDRATE_COMPASS | CRTSCTS | CS8 | CLOCAL | CREAD;
    newtio_cp.c_iflag = IGNPAR | ICRNL;
    newtio_cp.c_oflag = 0;
    newtio_cp.c_lflag = ICANON;
    newtio_cp.c_cc[VINTR]    = 0;     
    newtio_cp.c_cc[VQUIT]    = 0;     
    newtio_cp.c_cc[VERASE]   = 0;     
    newtio_cp.c_cc[VKILL]    = 0;    
    newtio_cp.c_cc[VEOF]     = 4;   
    newtio_cp.c_cc[VTIME]    = 0;     
    newtio_cp.c_cc[VMIN]     = 1;    
    newtio_cp.c_cc[VSWTC]    = 0;     
    newtio_cp.c_cc[VSTART]   = 0;    
    newtio_cp.c_cc[VSTOP]    = 0;    
    newtio_cp.c_cc[VSUSP]    = 0;    
    newtio_cp.c_cc[VEOL]     = 0;    
    newtio_cp.c_cc[VREPRINT] = 0;    
    newtio_cp.c_cc[VDISCARD] = 0;    
    newtio_cp.c_cc[VWERASE]  = 0;    
    newtio_cp.c_cc[VLNEXT]   = 0;     
    newtio_cp.c_cc[VEOL2]    = 0;     
    tcflush(iPortaCompass, TCIFLUSH);
    tcsetattr(iPortaCompass,TCSANOW,&newtio_cp);
}


/* *****************************************************************************
 * parser mensagem da bussola
 */

void quebraCompass(char frase[])
{
    char *tok;
    tok = strtok (frase,",");

    int pos=0;
    while (tok != NULL)
    {
        tok = strtok (NULL, ",");
        if (pos==0) { compass.dHeading = atof (tok); }
        if (pos==1) { strcpy(compass.sHeadingStatus,tok); }
        if (pos==2) { compass.dPitch = atof (tok); }
        if (pos==3) { strcpy(compass.sPitchStatus,tok); }
        if (pos==4) { compass.dRoll = atof (tok); }
        if (pos==5) { strcpy(compass.sRollStatus,tok); }

        pos++;
    }
}



camera adicionada





/* *****************************************************************************
 * bloco main
 */

int main(int argc, const char **argv)
{


