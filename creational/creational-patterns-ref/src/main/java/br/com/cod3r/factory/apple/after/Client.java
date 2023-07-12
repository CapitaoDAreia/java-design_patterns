package br.com.cod3r.factory.apple.after;

import br.com.cod3r.factory.apple.after.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.after.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.after.factory.IPhoneXSMaxFactory;
import br.com.cod3r.factory.apple.after.model.IPhone;

// TODO: Factory Review
/*
	Intenção:
	- Definir uma interface para criar um objeto, mas deixar as subclasses decidirem que classe instanciar.
	O Factory Method permite adiar a instanciação para subclasses.

	Os iphones implementam todos a classe Iphone, e todos possuem classes que são responsáveis pela sua criação.
	Essas classes criadoras são as fábricas, e elas sempre vão retornar Iphones que implementam a classe Iphone.

	Dessa forma, temos que o Cliente conhece as criadoras e a interface Iphone, mas não sabem como essa criação acontece,
	já que toda a lógica de criação está fora de seu alcance.

	As classes criadoras são subclasses de IphoneFactory, e elas decidem como cada iphone será criado. Ou seja,
	temos uma classe para criar objetos, mas são as subclasses quem decidem COMO esses objetos serão criados todos
	de acordo com suas especificidades.
*/

public class Client {

	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11ProFactory();

		// Adding a new one
		IPhoneFactory iphone11Factory = new IPhone11Factory();
		// Adding a new one 2
		IPhoneFactory iphoneXSMaxFactory = new IPhoneXSMaxFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = iphoneXFactory.orderIPhone();
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = iphone11ProFactory.orderIPhone();
		System.out.println(iphone2);

		// Adding a new one
		System.out.println("Adding a new one");
		IPhone iphone3 = iphone11Factory.orderIPhone();
		System.out.println(iphone3);

		// Adding a new one 2
		System.out.println("Adding a new one 2");
		IPhone iphone4 = iphoneXSMaxFactory.orderIPhone();
		System.out.println(iphone4);
	}
}
