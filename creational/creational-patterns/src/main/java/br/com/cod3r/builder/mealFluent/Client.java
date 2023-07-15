package br.com.cod3r.builder.mealFluent;

import br.com.cod3r.builder.mealFluent.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.mealFluent.model.FastFoodMeal;

//Todo: Builder review - fluent implementation
/*
	Neste caso, temos um relacionamento diferente da implementação anterior, pois não há
	uma classe diretora. O builder constrói as representações variadas de um mesmo objeto
	com base em parâmetros recebidos de forma encadeada, e no final, retorna um modelo específico
	desse objeto contemplando as características fornecidas na cadeia de chamadas.
*/

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Burguer")
			.andSide("Fries")
			.andDrink("Soda")
			.finishOrder();
		System.out.println(burguerCombo);
	}
}