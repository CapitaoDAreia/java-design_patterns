package br.com.cod3r.decorator.coffeeShop;

import br.com.cod3r.decorator.coffeeShop.model.Drink;
import br.com.cod3r.decorator.coffeeShop.model.Expresso;
import br.com.cod3r.decorator.coffeeShop.model.Tea;
import br.com.cod3r.decorator.coffeeShop.model.decorators.MilkDecorator;

// TODO: review Decorator
/*
	O padrão Decorator possui como intenção, de forma dinâmica, agregar responsabilidades
	adicionais a um objeto. Fornecem uma alternativa flexível ao uso de subclasses para extensão
	de funcionalidades.
	- No exemplo abaixo percebemos isso quando, nas classes 'Tea' e 'Expresso', que implementam
	a interface 'Drink', nós adicionamos propriedades por meio da composição com a classe
	'MilkDecorator', que é uma subclasse de 'DrinkDecorator'.
	- Por meio do decorator, é possível modificar os métodos ou atributos de uma classe. 
*/

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		
		//decorator
		Tea cha = new Tea();
		Expresso cafe = new Expresso();
		order("Chá com leite", new MilkDecorator(cha));
		order("Café com leite", new MilkDecorator(cafe));
	}
}
