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
        // Le os dados atuais
        gps.ler();
        bussola.ler();
        
        // Processa informações
        processaInfo();
        receberCoordenada();
        
        andar();
        
    }
}