package br.com.cod3r.builder.meal.director;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

//Classe diretora
/*
    Composta por: 
    - um builder
    - um construtor público que recebe um builder
    - um método para construir as refeições a partir de um builder recebido
    - um getter para obter a refeição que o builder constrói
*/
public class MealDirector {
    FastFoodMealBuilder builder = null;
    
    public MealDirector(FastFoodMealBuilder builder){
        this.builder = builder;
    }

    public void buildMeal(){
        builder.buildDessert();
        builder.buildDrink();
        builder.buildGift();
        builder.buildMain();
        builder.buildSide();
    }

    public FastFoodMeal getMeal(){
        return builder.getMeal();
    }
}
