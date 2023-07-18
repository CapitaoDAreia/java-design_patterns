package br.com.cod3r.decorator.coffeeShop.model.decorators;

import br.com.cod3r.decorator.coffeeShop.model.Drink;

public class MilkDecorator extends DrinkDecorator {

    public MilkDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        this.drink.serve();
        System.out.println("Milk decorator - Adding milk...");
    }

    @Override
    public Double getPrice() {
        return this.drink.getPrice() + 1.0;
    }
    
}
