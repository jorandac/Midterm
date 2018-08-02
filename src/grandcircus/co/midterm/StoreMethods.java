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

	// Display total
	public static void displayTotal(List<Product> shoppingCart) {
		int num = 1;
		double total = 0;
		double salesTax = 0.06;

		for (Product product : shoppingCart) {

			System.out.println(num + ". " + product);

			num++;

			total += product.getPrice();
		}

		System.out.println("Your Subtotal is: " + total);

		System.out.println("Your Total with tax is: " + total * salesTax);

	}

	// Cash Method

	// Credit Card Method

	// Check Method

	// Display receipt
	public static void displayReceipt() {
		System.out.println("Thank for shopping at Java Beans!");
		System.out.println("Your total is: ");
	}

	// Store payment info to .txt file

}
