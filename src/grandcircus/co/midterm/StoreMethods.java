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

	// Choose item

	// Display total

	// Get payment

	// Display receipt

	// Store payment info to .txt file

}
