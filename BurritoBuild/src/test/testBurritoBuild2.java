package test;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;
import model.BlackBeans;
import model.Bowl;
import model.BrownRice;
import model.BurritoBuilder2;
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

public class testBurritoBuild2 extends TestCase {

	BurritoBuilder2 tester = new BurritoBuilder2();
	BurritoOrder test = new BurritoOrder();
	
	@Test
	public void testBuildChickenBurrito() {
		BurritoOrder example = tester.buildChickenBurrito();
		test.addIngredient(new Chicken());
		test.addIngredient(new Tortilla());
		test.addIngredient(new WhiteRice());
		test.addIngredient(new Lettuce());
		test.addIngredient(new SourCream());
		float total1 = example.getCost();
		float total2 = test.getCost();
		Assert.assertEquals(total1,total2, 0.01); // burritos with the same contents should have the same cost
	}
	@Test
	public void testBuildSteakBurrito() {
		BurritoOrder example = tester.buildSteakBurrito();
		test.addIngredient(new Steak());
		test.addIngredient(new Bowl());
		test.addIngredient(new Lettuce());
		test.addIngredient(new BrownRice());
		test.addIngredient(new Salsa());
		test.addIngredient(new Cheese());
		test.addIngredient(new RefriedBeans());
		test.addIngredient(new SourCream());
		float total1 = example.getCost();
		float total2 = test.getCost();
		Assert.assertEquals(total1,total2, 0.01);
	}
	@Test
	public void testBuildPorkBurrito() {
		BurritoOrder example = tester.buildPorkBurrito();
		test.addIngredient(new Pork());
		test.addIngredient(new Tortilla());
		test.addIngredient(new Tomato());
		test.addIngredient(new BrownRice());
		test.addIngredient(new Guacamole());
		test.addIngredient(new Cheese());
		test.addIngredient(new BlackBeans());
		test.addIngredient(new SourCream());
		float total1 = example.getCost();
		float total2 = test.getCost();
		Assert.assertEquals(total1,total2, 0.01);
	}
}
