package grandcircus.co.midterm;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
		double salesTax = 1.06;

		for (Product product : shoppingCart) {

			double price = product.getPrice();

			total = price;

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
		String cardNumber = "";
		String expMonth = "";
		String expYear = "";
		String cvv = "";
		DecimalFormat df = new DecimalFormat("#.##");
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setGroupingSeparator(' ');
		DecimalFormat fmt = new DecimalFormat("0000,0000,0000,0000", symbols);

		// Credit card number
		for (int i = 0; i < 16; i++) {
			int randomCreditCardNumber = ThreadLocalRandom.current().nextInt(1, 9);
			cardNumber = cardNumber + "" + randomCreditCardNumber;

		}

		// Random ExpMonth

		int randomExp = ThreadLocalRandom.current().nextInt(1, 12);
		expMonth = expMonth + "" + randomExp;

		// Random ExpYear

		int randomYear = ThreadLocalRandom.current().nextInt(22, 28);
		expYear = expYear + "" + randomYear;

		// Random cvv
		for (int i = 0; i < 3; i++) {
			int randomCvv = ThreadLocalRandom.current().nextInt(1, 9);
			cvv = cvv + "" + randomCvv;

		}

		customerInformation = "Name: " + name + ": Card number: " + fmt.format(Double.parseDouble(cardNumber))
				+ " Exp date: " + expMonth + "\\" + expYear + " Cvv: " + cvv + " Total: $" + df.format(total);

		return customerInformation;

	}

	// Check Method (input check number)
	public static String checkMethod(String name, double total) {
		// Check number
		String customerInformation = null;
		DecimalFormat df = new DecimalFormat("#.##");
		String checkNumber = "";

		// Generate check number
		for (int i = 0; i < 4; i++) {
			int randomCheckNumber = ThreadLocalRandom.current().nextInt(1, 9);
			checkNumber = checkNumber + "" + randomCheckNumber;

		}
		customerInformation = "Name: " + name + " Check number: " + "#" + checkNumber + " Total: $" + df.format(total);

		return customerInformation;

	}

	// Display receipt
	public static void displayReceipt(List<CartItem> shoppingCart, double total) {
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Thank you for shopping at Java Beans!");
		System.out.println("Printing Receipt...\n");

		int num = 1;
		for (Product product : shoppingCart) {
			System.out.println(num + " " + product);
		}

		System.out.println("Your total is: " + df.format(total));

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
