package model;

public class Lettuce implements Ingredient{
	String name = "lettuce";
	String supplier = "Veg farm";
	double price = 0.8;

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
