package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
//TODO: review Abstract Factory
/*
	- A intenção do Abstract Factory é permitir que famílias de objetos sejam criadas com base em uma interface ou classe
	abstrata, de forma que cada objeto possa variar. O conceito de família, neste caso, está relacionado ao contexto
	de atuação desses objetos criados.
	- No caso do exemplo em questão, essas famílias  são os certificados e os pacotes, que estão todos dentro do contexto
	da criação de IPhones. Os IPhones são criados todos obedecendo a uma interface específica, por Factory Methods que também
	implementam cada um suas interfaces específicas (seguindo o padrão Factory Method).
	- A partir disso, cada fábrica específica de IPhone recebe um conjunto de regras, que correspondem cada um desses conjuntos
	a regras de países diferentes, possuindo a mesma interface.
	- Ou seja, injetamos nos Factory Methos de IPhones regras específicas que variam, mas que são construídas a partir de uma mesma
	interface, assim, criamos famílias de objetos com base em uma interface ou classe abstrata, objetos que variam respeitando um contexto.
*/
public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		CountryRulesAbstractFactory rules2 = new USRulesAbstractFactory();

		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		IPhoneFactory gen11Factory2 = new IPhone11Factory(rules2);
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);

		System.out.println("\n\n### Ordering an iPhone 11 US Standard");
		IPhone iphone3 = gen11Factory2.orderIPhone("standard");
		System.out.println(iphone3);
	}
}
