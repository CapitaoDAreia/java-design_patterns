package br.com.cod3r.builder.meal;

import br.com.cod3r.builder.meal.builder.FastFoodMainMeal;
import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.director.MealDirector;

//Cliente, o cara que precisa construir e determinar quais são as refeições
/*
	Classe pública que possui:
	- método order que orquestra a confecção dos pedidos
	- método main para rodar o código
*/ 

public class Client {
	
	public static void order(String mealName, FastFoodMealBuilder builder){
		MealDirector director = new MealDirector(builder);
		director.buildMeal();
		System.out.println(director.getMeal());
	}

	public static void main(String[] args) {
		order("Principal", new FastFoodMainMeal());
	}
}