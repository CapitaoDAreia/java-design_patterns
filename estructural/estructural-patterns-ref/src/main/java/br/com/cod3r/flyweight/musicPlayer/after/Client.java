package br.com.cod3r.flyweight.musicPlayer.after;

import br.com.cod3r.flyweight.musicPlayer.after.service.MusicService;

//TODO: review Flyweight
/*
	- A intenção do padrão Flyweight é oferecer um compartilhamento das características
	intrínsecas de um conjunto de objetos no ato da criação de novos objetos que possuam
	tais características.
	- No exemplo em questão, isso é implementado na criação de novas músicas e no "uso" destas.
	A cada vez que uma música é ouvida, não criamos uma nova, ao invés disso, utilizamos o compartilhamento
	da instância de uma música específicas e modificamos somente o número de vezes que esta mesma foi ouvida.
	O nome da música, artista e quantidades de segundo não mudam, são preservados e compartilhados.
	O que muda é a quantidade de vezes que ela foi reproduzida. 
*/

public class Client {

	public static void main(String[] args) {
		MusicService player = new MusicService();
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "Be Yourself;Audioslave;200");
		player.listenMusic("User B", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User B", "Be Yourself;Audioslave;200");
		
		player.report();
	}
}
