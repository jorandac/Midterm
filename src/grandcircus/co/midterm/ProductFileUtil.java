package grandcircus.co.midterm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFileUtil {

	// The path to the file to use
	public static final String FILE_NAME = "Menu.txt";
	public static final String FILE_NAME2 = "StorePaymentInfo.txt";

	// Modify this method as necessary to convert a line of text from the file to a
	// new item instance
	private static Product convertLineToItem(String line) {
		String[] products = line.split("\t");
		Product product = new Product();
		product.setName(products[0]);
		product.setDescription(products[2]);
		product.setPrice(Double.parseDouble(products[3]));
		product.setCategory(products[1]);
		return product;
	}

	// Modify this method as necessary to convert an item instance to a line of text
	// in the file
	private static String convertItemToLine(Product product) {
		return String.format("%s\t%d\t%s", product.getName(), product.getDescription(), product.getPrice());
	}

	// Read File Method
	public static List<Product> readFile() {
		List<Product> items = new ArrayList<>();

		try (
				// Open/prepare the resources in the try resources block
				FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
				Scanner fileScanner = new Scanner(fileInputStream)) {
			// loop until the end of the file
			while (fileScanner.hasNextLine()) {
				// read each line as a string
				String line = fileScanner.nextLine();
				// then convert it to an object
				items.add(convertLineToItem(line));
			}

		} catch (FileNotFoundException ex) {
			// If the file doesn't exist, there just aren't any items.
			return items;
		} catch (IOException e) {
			// If something else crazy goes wrong, print out the error.
			System.err.println("Something unexpected happended.");
			e.printStackTrace();
		}

		// Finally return the array of items.
		return items;

	}

	// Write to file
	public static void writeFile(List<Product> items) {
		try (
				// The `false` here tells the FileOutputStream to overwrite the file, rather
				// than append to it
				FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME2, false);
				PrintWriter fileWriter = new PrintWriter(fileOutputStream);) {
			// write to the file
			for (Product item : items) {
				// each item must be converted to a string of text to write to the file
				String line = convertItemToLine(item);
				fileWriter.println(line);
			}

		} catch (IOException e) {
			// If something else crazy goes wrong, print out the error.
			System.err.println("Something unexpected happended.");
			e.printStackTrace();
		}
	}

}
