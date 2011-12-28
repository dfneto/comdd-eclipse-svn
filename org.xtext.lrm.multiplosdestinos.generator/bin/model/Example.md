plataforma pionner
robo david

adicionar defines
adicionar includes

importar pacote player;
importar pacote localizacao;

criarSensor gps
criarSensor bussola
criarSensor camera

int main() {
	gps.ligar();
	bussola.ligar();
	carregarListaCoordenadas();
	inicializarPlayer();
	while(true) {
		bussola.ler();
		gps.ler();
		receberCoordenada();

		processaInfo();

		defineRegraSeguirMultiplasCoordenadas();

		andar();
	}
}
