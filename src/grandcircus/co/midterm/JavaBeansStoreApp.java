package grandcircus.co.midterm;

import java.util.List;
import java.util.Scanner;

public class JavaBeansStoreApp {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// New Country ArrayList
		List<Product> menu = ProductFileUtil.readFile();

		// Display Menu
		StoreMethods.displayMenu(menu);

	}

}
