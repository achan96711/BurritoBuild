package model;

public class Cheese implements Ingredient{
	String name = "cheese";
	String supplier = "Tom's Dairy";
	double price = 0.4;

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

