package grandcircus.co.midterm;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class StoreMethods {

	// Scanner
	static Scanner scnr = new Scanner(System.in);

	// display menu
	public static void displayMenu(List<Product> products) {

		int num = 1;

		for (Product product : products) {

			System.out.println(num + ". " + product);

			num++;

		}

	}

	// Get Total
	public static double getTotal(List<CartItem> shoppingCart) {

		double total = 0;
		double salesTax = 0.06;

		for (CartItem product : shoppingCart) {
			double newPrice = product.getPrice();
			
			System.out.println(newPrice);
			total += product.getPrice();
		}

		return total * salesTax;

	}

	// Display total
	public static void displayTotal(double total, List<Product> products) {

		int num = 1;

		for (Product product : products) {

			System.out.println(num + ". " + product);

			num++;

		}

		System.out.println("Your Total with tax is: " + total);

	}

	// Cash Method (Return change)

	public static double cashMethod(double amount, double total) {

		// Calculates change and returns string to call when printing receipt

		double change = total - amount;

		return change;

	}
	// Credit Card Method (input card information)

	public static String creditCardMethod(String name, double total) {

		String customerInformation = null;

		// Credit card number
		int randomCreditCardNumber = ThreadLocalRandom.current().nextInt(1, 16 + 1);

		// Random Exp Date
		int randomExpDate = ThreadLocalRandom.current().nextInt(1, 4 + 1);

		// Random cvv
		int randomCVV = ThreadLocalRandom.current().nextInt(1, 3 + 1);

		customerInformation = "Name: " + name + "Card number: " + randomCreditCardNumber + "Exp date:  " + randomExpDate
				+ "Cvv:  " + randomCVV + "Total: $" + total;

		return customerInformation;

	}

	// Check Method (input check number)
	public static String checkMethod(String name, double total) {
		// Check number
		int randomCheckNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);

		String checkNumber = "Name: " + name + randomCheckNumber + "#" + "Total: $" + total;

		return checkNumber;

	}

	// Display receipt
	public static void displayReceipt(List<CartItem> shoppingCart, double total) {
		System.out.println("Thank you for shopping at Java Beans!");
		int num = 1;
		for (Product product : shoppingCart) {
			System.out.println(num + " " + product);
		}

		System.out.println("Your total is: " + total);

	}

	// Build sandwich method
	public static Sandwich buildSandwich(String name, String description, double price, String category) {
		// Take customer information for new Sandwich
		System.out.println("\nWhat type of bread would you like?");
		System.out.print("Enter bread: ");
		String userBread = Validator.getStringWithValidInformation(scnr, "");
		scnr.reset();
		System.out.print("Enter Cheese: ");
		String userCheese = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Enter meat: ");
		String userMeat = Validator.getStringWithValidInformation(scnr, "");
		System.out.print("Egg? Yes or no ");
		String userEgg = Validator.YesOrNo(scnr, "");
		Sandwich userSandwhich = new Sandwich(name, description, price, category, userBread, userCheese, userMeat,
				userEgg);
		return userSandwhich;

	}

}
