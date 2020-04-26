package model;

public class RefriedBeans implements Ingredient{
	String name = "refried beans";
	String supplier = "Goya";
	double price = 0.2;

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