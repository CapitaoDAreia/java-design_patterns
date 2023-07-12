package br.com.cod3r.factory.apple.halfSimple;

import br.com.cod3r.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfSimple.model.IPhone;

// Todo: Factory Review

/*
	Nessa implementação, as fábricas recebem parâmetros e decidem com base nesses parâmetros qual será
	o objeto retornado. Perceba que tudo continua da mesma forma. Existe uma classe Factory na qual as
	Factories mais específicas se baseiam decidindo com base em parâmetros qual será a criação retornada.

	Clicando dentro das Factories nós percebemos que uma certa complexidade foi adicionada a elas, pois agora
	precisam lidar com parâmetros para efetuar seus retornos.
*/

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
