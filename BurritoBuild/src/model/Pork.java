package model;

public class Pork implements Ingredient{
	String name = "pork";
	String supplier = "Purdue Farms";
	double price = 3.5;

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
