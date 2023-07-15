package br.com.cod3r.builder.mealFluent.model;

public class FastFoodMeal {

	private String drink;
	private String main;
	private String side;

	public FastFoodMeal(String main, String drink, String side){
		this.drink = drink;
		this.main = main;
		this.side = side;
	}
	
	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Combo [drink=" + drink + ", main=" + main + ", side=" 
				+ side + ", dessert=" + ", gift=" + "]";
	}
}
