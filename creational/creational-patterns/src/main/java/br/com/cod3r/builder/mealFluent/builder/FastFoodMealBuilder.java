package br.com.cod3r.builder.mealFluent.builder;

import br.com.cod3r.builder.mealFluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
    private String main;

    private String drink;
    private String side;

    public FastFoodMealBuilder(String main){
        this.main = main;
    }

    public FastFoodMealBuilder andSide(String side){
        this.side = side;
        return this;
    }

    public FastFoodMealBuilder andDrink(String drink){
        this.drink = drink;
        return this;
    }

    public FastFoodMeal finishOrder(){
        return new FastFoodMeal(main, drink, side);
    }
}
