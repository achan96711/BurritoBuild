package model;

public class BlackBeans implements Ingredient{
	String name = "black beans";
	String supplier = "Goya";
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

