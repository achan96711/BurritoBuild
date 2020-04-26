package model;

public class Tortilla implements Ingredient{
	String name = "tortilla";
	String supplier = "In-house";
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
