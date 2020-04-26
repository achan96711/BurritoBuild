package model;

public class Bowl implements Ingredient{
	String name = "bowl";
	String supplier = "Utensil";
	double price = 0.1;

	public double price() {
		return price;
	}
	
	public String supplier() {
		return supplier;
	}
	
	public String name() {
		return name;
	}
	
}
