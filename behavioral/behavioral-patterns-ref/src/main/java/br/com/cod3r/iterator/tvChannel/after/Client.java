package br.com.cod3r.iterator.tvChannel.after;

//Todo: review Iterator
/*
	A intenção do padrão Iterator é prover uma maneira de acessar os elementos de um objeto
	agragado sequencialmente sem expor sua representação interna.
	- A aplicação desse padrão no caso específico se dá por meio de um recurso do próprio Java, a
	interface iterable. Essa interface possui dois métodos, o hasNext e o next.

	Neste caso, ao invés de o cliente efetuar uma iteração sobre uma lista de objetos,
	com o uso deste recurso, nós conseguimos entregar um Iterator, que percorre a lista e conhece cada
	elemento dela, ficando essa responsabilidade fora do cliente, com o cliente conhecendo apenas
	cada elemento e sabendo se existe o próximo elemento ou não através do métodos next e hasNext.
*/

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.searchAvaiableChannels();
		for(Integer channel: tv) {
			System.out.println(String.format("Zapping at channel #%d", channel));
		}
	}
}
