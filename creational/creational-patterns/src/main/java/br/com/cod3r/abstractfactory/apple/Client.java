package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone11;

// TODO: Abstract Factory review
/*
	- Neste caso, aplicando o padrão Abstract Factory, criamos as regras específicas para o Brasil com a Factory
	(classe) 'BrazilianRulesAbstractFactory' que implementa a interface 'CountryRulesAbstractFactory'.
	- Após isso, criamos um modelo específico de iPhone, baseado em uma factory específica, que implementa uma classe
	genérica. Passamos para a factory do iphone um objeto (as regras) criado a partir da Factory (classe) 'BrazilianRulesAbstractFactory'.
	Se considerarmos que as regras passadas na criação do iPhone são regras de um país específico, e que podem existir outro
	conjunto de regras para outro país, entenderemos que os objetos regras constituem uma família de objetos baseada na mesma classe, que variam
	e pertencem a um contexto específico. Esses objetos serão injetados nos objetos iPhone, que dependem dos mesmos para serem criados.
	- Essa é uma implementação perfeita do Abstract Factory. A fábrica abstrata é justamente a que cria as regras, unindo certificados e pacotes,
	disponibilizando as mesmas regras, de forma que as regras variam, e a partir de uma única interface.
*/
public class Client {
	
	public static void main(String[] args) {
		System.out.println("Criando novo iPhone certificado com os padrões do Brasil.");
		CountryRulesAbstractFactory brRules = new BrazilianRulesAbstractFactory();
		IPhone iPhone11 = new IPhone11(brRules);
		System.out.println(iPhone11);
	}
}
