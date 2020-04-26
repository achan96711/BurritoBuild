package model;

public class Guacamole implements Ingredient{
	String name = "guacamole";
	String supplier = "Avocadoland";
	double price = 1.5;

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

