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

		//TODO: do/while loop starts here
		
		//TODO: Ask user to choose item
		//TODO: get user input
		
			//TODO: if user chooses drink, ask for hot or cold choice
			//TODO: if user chooses sandwich, ask for options:
				//TODO: meat, cheese, egg/no egg, bread
			//TODO: store user choice in ArrayList
		
		//TODO: Ask if user wants to add more items , loop ends here
		
		//TODO: display subtotal
		
		//TODO: ask for payment type Switch/Case
			
				//cash - call cash method
				//credit - call credit method, write to file
				//check - call check method, write to file
		
		//TODO: display receipt
	}

}
