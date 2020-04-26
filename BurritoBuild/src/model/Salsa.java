package model;

public class Salsa implements Ingredient{
	String name = "salsa";
	String supplier = "In house";
	double price = 0.3;

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

