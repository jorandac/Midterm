//Cameron Barnes
//JoRanda Chapman
//Lauren Shindo

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
		List<CartItem> shoppingCart = new ArrayList<>();

		String userContinues = "yes"; // keeps track of whether user wants to continue in the loop

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

			// if user chooses a drink, have user choose hot or iced, and drink size
			if (menu.get(productChoice).getcategory().equals("drink")) {

				// set temporary drink variable to store user choice
				Drink myDrink = (Drink) menu.get(productChoice);
				String drinkTemp = Validator.getStringIcedOrHot(scnr, "\nWould you like your drink hot or iced? ");
				scnr.reset();

				// set temporary drink variable to store user choice
				myDrink.setTemperature(drinkTemp);

				String drinkSize = Validator.getStringSize(scnr, "Would you like your drink small, medium, or large? ");
				myDrink.setSize(drinkSize);
				scnr.reset();

				int quantity = Validator.getInt(scnr, "How many would you like? ");

				// add product to shopping cart
				CartItem myNewItem = new CartItem(myDrink, quantity);
				shoppingCart.add(myNewItem);

				int num = 1;
				for (CartItem cartItem : shoppingCart) {
					System.out.println(num + ". " + cartItem);
					num++;
				}

				// extra line for readability
				System.out.println();
			}

			else if (menu.get(productChoice).getName().contains("Breakfast Sandwich")) {

				Sandwich mySandwich = StoreMethods.buildSandwich(menu.get(productChoice).getName(),
						menu.get(productChoice).getDescription(), menu.get(productChoice).getPrice(),
						menu.get(productChoice).getcategory());

				int quantity = Validator.getInt(scnr, "How many would you like? ");

				// add product to shopping cart
				CartItem myNewItem = new CartItem(mySandwich, quantity);
				shoppingCart.add(myNewItem);

				int num = 1;
				for (CartItem cartItem : shoppingCart) {
					System.out.println(num + ". " + cartItem);
					num++;
				}

				// Extra Line for Readability
				System.out.println();

			} else {
				int quantity = Validator.getInt(scnr, "How many would you like? ");
				CartItem myNewItem = new CartItem(menu.get(productChoice), quantity);
				shoppingCart.add(myNewItem);

				int num = 1;
				for (CartItem cartItem : shoppingCart) {
					System.out.println(num + ". " + cartItem);
					num++;
				}

			}
			// TODO: store user choice in ArrayList
			scnr.nextLine(); // clear scanner
			// Ask if user wants to add more items , loop ends here
			userContinues = Validator.YesOrNo(scnr, "\nWould you like to add anything else to your order? (yes/no) ");

		} while (userContinues.matches("yes"));

		// TODO: display subtotal
		double shoppingCartTotal = StoreMethods.getTotal(shoppingCart);

		// TODO: Ask for Payment Type: Switch/Case

		int paymentChoice = Validator.getInt(scnr,
				"\nHow would you like to pay? " + "(Choose 1 for cash, 2 for credit, or 3 for check): ", 1, 3);
		System.out.println(); // Blank Line for Readability

		switch (paymentChoice) {
		case 1:
			// Cash Method
			System.out.println("Enter your Cash Amount");
			double userAmount = scnr.nextDouble();
			double change = StoreMethods.cashMethod(shoppingCartTotal, userAmount);
			System.out.println("Your Change Due is " + change);

			break;
		case 2:
			// Credit Method: Write to File
			String userName = Validator.getString(scnr, "Please enter your name ");
			String customerInformation = StoreMethods.creditCardMethod(userName, shoppingCartTotal);
			ProductFileUtil.writeFile(customerInformation);
			System.out.println("Your Payment has been approved!");
			break;

		case 3:
			// Check Method: Write to File
			String userNameCheck = Validator.getString(scnr, "Please enter your name ");
			String customerInformationCheck = StoreMethods.checkMethod(userNameCheck, shoppingCartTotal);
			ProductFileUtil.writeFile(customerInformationCheck);
			System.out.println("Your Payment has been approved!");
			break;

		}
		System.out.println("Thank you for shopping with us. Enjoy your day!");

		// TODO: display receipt
		StoreMethods.displayReceipt(shoppingCart, shoppingCartTotal);
	}

}
