package view;
import model.BurritoBuilder2;
import model.BurritoOrder;

public class BurritoClient {
public static void main(String[] args) {
	BurritoBuilder2 example = new BurritoBuilder2();
	BurritoOrder chickenB = example.buildChickenBurrito();
	System.out.println("Chicken Burrito example");
	chickenB.showIngredients();
	double cTotal = chickenB.getCost();
	System.out.println("Total cost for chicken burrito: ");
	System.out.printf("Value: %.2f", cTotal);
	System.out.println();
	System.out.println();
	
	BurritoOrder steakB = example.buildSteakBurrito();
	System.out.println("Steak Burrito example");
	steakB.showIngredients();
	double sTotal = steakB.getCost();
	System.out.println("Total cost for steak burrito: ");
	System.out.printf("Value: %.2f", sTotal);
	System.out.println();
	System.out.println();
	
	BurritoOrder porkB = example.buildPorkBurrito();
	System.out.println("Pork Burrito example");
	porkB.showIngredients();
	double pTotal = porkB.getCost();
	System.out.println("Total cost for pork burrito: ");
	System.out.printf("Value: %.2f", pTotal);
	System.out.println();
 }
}