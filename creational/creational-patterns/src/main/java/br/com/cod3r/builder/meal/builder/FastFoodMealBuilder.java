package br.com.cod3r.builder.meal.builder;

import br.com.cod3r.builder.meal.model.FastFoodMeal;

//Classe builder, construtora das refeições
/*
    Composta por:
    - um atributo protegido, que é a refeição em si
    - um construtor público que instancia uma nova refeição
    - um getter para retornar essa refeição
    - métodos abstratos públicos que são:
        public abstract void buildDrink();
        public abstract void buildMain();
        public abstract void buildSide();
        public abstract void buildDessert();
        public abstract void buildGift();
*/
public abstract class FastFoodMealBuilder {
	protected FastFoodMeal meal = null;

    public FastFoodMealBuilder(){
        meal = new FastFoodMeal();
    }

    public FastFoodMeal getMeal(){
        return meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
