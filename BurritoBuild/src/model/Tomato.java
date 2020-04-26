package model;

public class Tomato implements Ingredient{
	String name = "tomato";
	String supplier = "Local Market";
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

