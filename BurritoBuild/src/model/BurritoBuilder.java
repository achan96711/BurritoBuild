package model;
import java.util.*;

public class BurritoBuilder {
//Director+Client
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the burrito builder");
		System.out.println("How many burritos do you want to order: ");
		int amount = keyboard.nextInt();
		double total = 0;
		
		
		ArrayList<BurritoOrder> order = new ArrayList<BurritoOrder>(amount);
		
		for(int i = 0; i < amount; i++) {
			BurritoOrder burrito = new BurritoOrder();
			
		System.out.println("This is burrito number "+ amount + ": ");
		System.out.println("Do you want a tortilla to hold the contents of this burrito order?");
		System.out.println("Type yes to accept or type no for a bowl: ");
		String response = keyboard.nextLine();
		keyboard.nextLine();
			
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Tortilla());
		}
		else {
			burrito.addIngredient(new Bowl());
		}
		
		System.out.println("Do you want to add white rice, brown rice, or skip?");
		System.out.println("Type white for white rice, brown for brown rice or, skip for neither: ");
		response = keyboard.nextLine();
		
		if(response.equalsIgnoreCase("white")) {
			burrito.addIngredient(new WhiteRice());
		}
		else if (response.equalsIgnoreCase("brown")) {
			burrito.addIngredient(new BrownRice());
	    }
			
		System.out.println("Do you want to add refried beans, black beans, or skip?");
		System.out.println("Type refried for refried beans, black for black beans or, skip for neither: ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("refried")) {
			burrito.addIngredient(new RefriedBeans());
		}
		else if (response.equalsIgnoreCase("black")) {
			burrito.addIngredient(new BlackBeans());
	    }
		
		System.out.println("Do you want to add chicken, steak, pork or skip the meat choice?");
		System.out.println("Type chicken for chicken, steak for steak or, pork for pork, or skip for none: ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("chicken")) {
			burrito.addIngredient(new Chicken());
		}
		else if (response.equalsIgnoreCase("steak")) {
			burrito.addIngredient(new Steak());
	    }
		else if (response.equalsIgnoreCase("pork")) {
			burrito.addIngredient(new Pork());
	    }
		
		System.out.println("Do you want to add salsa, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Salsa());
		}
		
		System.out.println("Do you want to add shreded monterray jack cheese, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Cheese());
		}
		
		System.out.println("Do you want to add lettuce, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Lettuce());
		}
		
		System.out.println("Do you want to add tomatoes, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Tomato());
		}
		
		System.out.println("Do you want to add sour cream, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new SourCream());
		}
		
		System.out.println("Do you want to add guacamole, type yes to add or no to skip : ");
		response = keyboard.nextLine();
		
		
		if(response.equalsIgnoreCase("yes")) {
			burrito.addIngredient(new Guacamole());
		}
		
		System.out.println("This burrito is done being built");
		order.add(burrito);
		System.out.println("The burrito is being wrapped up and packaged.");
	}
		System.out.println();
		System.out.println("Bill for burritos");
		System.out.println("**********************");
		System.out.println();
		
		for(int j = 0; j < amount; j++) {
			int display = j + 1;
			System.out.println("Burrito number: " + display);
			order.get(j).showIngredients();
			double payment = order.get(j).getCost();
			System.out.println("Burrito Price: ");
			System.out.printf("Value: %.2f", payment);
			total += payment;
		}
		System.out.println();
		System.out.println("Total Payment required for order: ");
		System.out.printf("Value: %.2f", total);
		System.out.println();
		System.out.println();
		System.out.println("Thank you for ordering with the burrito builder application");
		keyboard.close();
		System.exit(0);
   }
}