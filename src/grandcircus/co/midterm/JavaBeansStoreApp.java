package grandcircus.co.midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBeansStoreApp {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Product ArrayList
		List<Product> menu = ProductFileUtil.readFile();
		// Shopping cart
		List<Product> shoppingCart = new ArrayList<>();

		String userContinues = "n"; // keeps track of whether user wants to continue in the loop

		// Welcome message to user
		System.out.println("Welcome to Java Beans!\n");

		// Display Menu
		StoreMethods.displayMenu(menu);

		// loop starts here
		do {

			// TODO: Ask user to choose item
			int productChoice = Validator.getInt(scnr, "\nPlease choose an item from our menu " + "(enter a number): ",
					1, menu.size());

			scnr.nextLine(); // clear scanner for taking in string next

			// TODO: if user chooses drink, ask for hot or cold choice
			// TODO: if user chooses sandwich, ask for options:
			// TODO: meat, cheese, egg/no egg, bread
			if (menu.get(productChoice).getName().contains("Breakfast Sandwich")) {

				String sandwichBread = Validator.getString(scnr, "\nWhat type of bread would you like? ");
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
		// comment here

	}

}
