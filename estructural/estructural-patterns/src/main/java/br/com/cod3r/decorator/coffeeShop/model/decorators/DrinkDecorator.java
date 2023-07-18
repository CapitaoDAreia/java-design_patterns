package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	Drink drink = null;

    public DrinkDecorator(Drink drink){
        this.drink = drink;
    }
}