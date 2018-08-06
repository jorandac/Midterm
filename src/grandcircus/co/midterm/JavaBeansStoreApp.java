//Cameron Barnes
//JoRanda Chapman
//Lauren Shindo

package grandcircus.co.midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBeansStoreApp {

	/*
	 * TODO: Formatting (Cameron): Format product List, Cart, Write File
	 *  Drinks:Lauren 
	 *  JoRanda: Switch Cases: 
	 *  Descriptions 1-4: Cam, 
	 *  9-12 Joranda:
	 * 
	 */

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Product ArrayList
		List<Product> menu = ProductFileUtil.readFile();
		// Shopping cart
		List<CartItem> shoppingCart = new ArrayList<>();

		String userContinues = "n"; // keeps track of whether user wants to continue in the loop

		// Welcome message to user
		System.out.println("Welcome to Java Beans!\n");

		// Display Menu
		StoreMethods.displayMenu(menu);

		// loop starts here
		do {

			// Ask user to choose item
			int productChoice = Validator.getInt(scnr, "\nPlease choose an item from our menu " + "(enter a number): ",
					1, menu.size());

			scnr.nextLine(); // clear scanner for taking in string in next step

			//if user chooses a drink, have user choose hot or iced, and drink size
			if (menu.get(productChoice).getcategory().equals("drink")) {
				//set temporary drink variable to store user choice
				Drink myDrink =  (Drink) menu.get(productChoice);
				String drinkTemp = Validator.getStringWithValidInformation(scnr, "\nWould you like your drink hot or iced? ");
				myDrink.setTemperature(drinkTemp);
				
				String drinkSize = Validator.getString(scnr, "\nWould you like your drink small, medium, or large? ");
				myDrink.setSize(drinkSize);
				
				int quantity = Validator.getInt(scnr, "How many would you like? ");
				
				//add product to shopping cart
				CartItem myNewItem = new CartItem(myDrink, quantity);
				shoppingCart.add(myNewItem);
				
				System.out.println(shoppingCart.toString());
				//TODO: print only number, product name, and price. Not description.
				
				//extra line for readability
				System.out.println();
			}

			if (menu.get(productChoice).getName().contains("Breakfast Sandwich")) {

				Sandwich mySandwich =  (Sandwich) menu.get(productChoice);
				String bread = Validator.getString(scnr, "\nWhat type of bread would you like? ");
				mySandwich.setBread(bread);
				
				String cheese = Validator.getString(scnr, "\nWhat type of cheese would you like? ");
				mySandwich.setCheese(cheese);
				
				String meat = Validator.getString(scnr, "\nWhat type of meat would you like? ");
				mySandwich.setMeat(meat);
				
				int quantity = Validator.getInt(scnr, "How many would you like? ");
				
				//add product to shopping cart
				CartItem myNewItem = new CartItem(mySandwich, quantity);
				shoppingCart.add(myNewItem);
				
			}
			// TODO: store user choice in ArrayList

			// Ask if user wants to add more items , loop ends here
			userContinues = Validator.getString(scnr, "\nWould you like to add anything else to your order? (y/n) ");

		} while (userContinues.matches("[yY].*"));

		// TODO: display subtotal

		// TODO: ask for payment type Switch/Case
		int paymentChoice = Validator.getInt(scnr,
				"\nHow would you like to pay? " + "(Choose 1 for cash, 2 for credit, or 3 for check): ", 1, 3);
		System.out.println(); // blank line for readability

		switch (paymentChoice) {
		case 1:
			// cashMethod
			break;
		case 2:
			// creditMethod, write to file
			break;
		case 3:
			// check method, write to file
			break;

		}

		// TODO: display receipt

	}

}