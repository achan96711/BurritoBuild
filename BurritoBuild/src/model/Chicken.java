package model;

public class Chicken implements Ingredient{
	String name = "chicken";
	String supplier = "Tyson";
	double price = 3;

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
