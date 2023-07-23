package br.com.cod3r.chain.billsDispenser.after;

// TODO: review Chain Of Responsability
/*
	- A intenção do padrão CoR é fornecer uma cadeia de objetos para tratar uma solicitação, evitando
	o acoplamento entre o solicitante e o objeto que irá tratar essa solicitação.
	- No caso abaixo, temos um exemplo disso simulando a dispensa de cédulas em um caixa eletrônico.
	Recebe-se um valor, trata-se esse valor em cédulas maiores, definindo quantas das cédulas maiores
	contemplam o valor recebido. Em seguida, chama-se um método que fará a mesma coisa com o valor
	restante relacionando-o a cédulas menores, e assim sucessivamente, até que o valor seja completamente
	contemplado pelas cédulas disponíveis.
	- O padrão CoR, neste caso, está presente no compartilhamento de responsabilidades em cadeia, até que determinada
	solicitação seja atendida pelo receptor, que neste caso, é o método 'withDraw' do objeto 'dispenser'. 
*/

public class Client {

	public static void main(String[] args) {
		Dispenser dispenser = new Dispenser();
		System.out.println("Withdrawing $230...");
		dispenser.withDraw(230);
		System.out.println("Withdrawing $1589...");
		dispenser.withDraw(1589);
		
		Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128), new Bill(64)
				, new Bill(32), new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
		System.out.println("Withdrawing $230...");
		customDispenser.withDraw(230);
		System.out.println("Withdrawing $1589...");
		customDispenser.withDraw(1589);
	}
}
