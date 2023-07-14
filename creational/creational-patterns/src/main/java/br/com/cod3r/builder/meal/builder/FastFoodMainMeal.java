package br.com.cod3r.builder.meal.builder;

public class FastFoodMainMeal extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Soda");
    }

    @Override
    public void buildMain() {
        meal.setMain("Praça da Árvore");
    }

    @Override
    public void buildSide() {
        meal.setSide("Fries");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice Cream");
    }

    @Override
    public void buildGift() {
        meal.setToy("Colesterol alto");
    }
    
}
