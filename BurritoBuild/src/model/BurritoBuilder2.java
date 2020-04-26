package model;

import model.BlackBeans;
import model.Bowl;
import model.BrownRice;
import model.BurritoOrder;
import model.Cheese;
import model.Chicken;
import model.Guacamole;
import model.Lettuce;
import model.Pork;
import model.RefriedBeans;
import model.Salsa;
import model.SourCream;
import model.Steak;
import model.Tomato;
import model.Tortilla;
import model.WhiteRice;

public class BurritoBuilder2 {
	//Director
		public BurritoOrder buildChickenBurrito() {
			BurritoOrder a = new BurritoOrder();
			a.addIngredient(new Chicken());
			a.addIngredient(new Tortilla());
			a.addIngredient(new WhiteRice());
			a.addIngredient(new Lettuce());
			a.addIngredient(new SourCream());
			return a;
		}
		
		public BurritoOrder buildSteakBurrito() {
			BurritoOrder b = new BurritoOrder();
			b.addIngredient(new Steak());
			b.addIngredient(new Bowl());
			b.addIngredient(new Lettuce());
			b.addIngredient(new BrownRice());
			b.addIngredient(new Salsa());
			b.addIngredient(new Cheese());
			b.addIngredient(new RefriedBeans());
			b.addIngredient(new SourCream());
			return b;
		}
		
		public BurritoOrder buildPorkBurrito() {
			BurritoOrder c = new BurritoOrder();
			c.addIngredient(new Pork());
			c.addIngredient(new Tortilla());
			c.addIngredient(new Tomato());
			c.addIngredient(new BrownRice());
			c.addIngredient(new Guacamole());
			c.addIngredient(new Cheese());
			c.addIngredient(new BlackBeans());
			c.addIngredient(new SourCream());
			return c;
		}
}
