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

		//TODO: Welcome message

		// Shopping cart
		List<Product> shoppingCart = new ArrayList<>(); // TODO push to repository

		// Display Menu
		StoreMethods.displayMenu(menu);

		//TODO: Ask user to choose item
		//TODO: get user input
		
			//TODO: if user chooses drink, ask for hot or cold choice
			//TODO: if user chooses sandwich, ask for options:
				//TODO: meat, cheese, egg/no egg, bread
			//TODO: store user choice in ArrayList
		
		//Ask to add 
	}

}
