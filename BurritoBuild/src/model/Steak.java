package model;

public class Steak implements Ingredient{
	String name = "steak";
	String supplier = "Oscar Farm";
	double price = 4;

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
