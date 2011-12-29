// Definindo a plataforma do robo como pioneer
plataforma pioneer

// Define o nome do robo como uma concatenacao dos nomes dos desenvolvedores
robo filipeAlexandre

adicionar includes
adicionar defines

importar pacote localizacao;
importar pacote player;

criarSensor gps
criarSensor bussola

int main() {

    // Ligar o GPS
    gps.ligar();
    
    // Ligar Bussola
    bussola.ligar();
    
    // Carrega lista de coordernadas e inicializa Player
    carregarListaCoordenadas();
    inicializarPlayer();
    
    // Loop
    while(true) {
        //Falta fazer o funcioanamento de leitura das coordenadas
    }
}