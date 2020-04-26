package model;

public class WhiteRice implements Ingredient{
	String name = "white rice";
	String supplier = "Sysco";
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
