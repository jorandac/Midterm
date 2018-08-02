package grandcircus.co.midterm;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StoreMethods {

	// display menu
	public static void displayMenu(List<Product> products) {

		int num = 1;

		for (Product product : products) {

			System.out.println(num + ". " + product);

			num++;

		}

	}

	// Get Total
	public static double getTotal(List<Product> shoppingCart) {

		double total = 0;
		double salesTax = 0.06;

		for (Product product : shoppingCart) {

			total += product.getPrice();
		}

		return total * salesTax;

	}

	// Display total
	public static void displayTotal(double total) {

		System.out.println("Your Total with tax is: " + total);

	}

	// Cash Method (Return change)

	public static double cashMethod(double amount, double total) {

		// Calculates change and returns string to call when printing receipt

		double change = total - amount;

		return change;

	}
	// Credit Card Method (input card information)

	public static void creditCardMethod() {

		// Credit card number
		int randomCreditCardNumber = ThreadLocalRandom.current().nextInt(1, 16 + 1);

		// Random Exp Date
		int randomExpDate = ThreadLocalRandom.current().nextInt(1, 4 + 1);

		// Random cvv
		int randomCvv = ThreadLocalRandom.current().nextInt(1, 3 + 1);

		System.out.println(
				"Card Number: " + randomCreditCardNumber + "Exp Date: " + randomExpDate + " Cvv: " + randomCvv);

	}

	// Check Method (input check number)
	public static void checkMethod() {
		// Check number
		int randomCheckNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);

		System.out.println(randomCheckNumber + "#");

	}

	// Display receipt
	public static void displayReceipt() {
		System.out.println("Thank for shopping at Java Beans!");
		System.out.println("Your total is: ");
	}

	// Store payment info to .txt file

}
