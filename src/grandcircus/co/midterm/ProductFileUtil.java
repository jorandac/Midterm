package grandcircus.co.midterm;

public class ProductFileUtil {

	// The path to the file to use
	public static final String FILE_NAME = "Menu.txt";

	// Modify this method as necessary to convert a line of text from the file to a
	// new item instance
	private static Product convertLineToItem(String line) {
		String[] products = line.split("\t");
		Product product = new Product();
		product.setName(products[0]);
		product.setDescription(products[1]);
		product.setPrice(Double.parseDouble(products[2]));
		return product;
	}
}
