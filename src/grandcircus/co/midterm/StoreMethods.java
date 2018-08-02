package grandcircus.co.midterm;

import java.util.List;

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

	// Check Method (input check number)

	// Display receipt
	public static void displayReceipt() {
		System.out.println("Thank for shopping at Java Beans!");
		System.out.println("Your total is: ");
	}

	// Store payment info to .txt file

}
