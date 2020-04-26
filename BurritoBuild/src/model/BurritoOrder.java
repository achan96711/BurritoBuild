package model;
import java.util.*;
//ConcreteBuilder
public class BurritoOrder {
private List<Ingredient> burritoComp = new ArrayList<Ingredient>(); //product

public void addIngredient(Ingredient ingredient) {
	burritoComp.add(ingredient);
}

public float getCost() {
	float total = 0;
	
	for(Ingredient ingredient: burritoComp) {
		total += ingredient.price();
	}
	
	return total;
}

public void showIngredients() {
	
	for (Ingredient ingredient : burritoComp) {
		System.out.println("Ingredient: " + ingredient.name());
		System.out.println("Price: " + ingredient.price());
	}
}

public List<Ingredient> getBurritoComp() {
	return burritoComp;
}

}
