package model;

public class SourCream implements Ingredient{
	String name = "sour cream";
	String supplier = "Tom's Dairy";
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
