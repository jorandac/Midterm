package grandcircus.co.midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaBeansStoreApp {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// New Product ArrayList
		List<Product> menu = ProductFileUtil.readFile();

		// Shopping cart
		List<Product> shoppingCart = new ArrayList<>(); // TODO push to repository

		// Display Menu
		StoreMethods.displayMenu(menu);

	}

}
