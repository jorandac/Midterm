<<<<<<< HEAD
package grandcircus.co.midterm;

public class CartItem extends Product {

	private Product product;

	private int quantity;

	private double price;

	public CartItem(Product product, int quantity, double price) {

		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public CartItem() {

	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return product + "\t " + "Quantity: " + quantity;
	}

}
=======
//package grandcircus.co.midterm;
//
//public class CartItem extends Product {
//
//	private int quantity;
//
//	public CartItem(String name, String description, double price, String category, int quantity) {
//		super(name, description, price, category);
//		this.quantity = quantity;
//	}
//
//	public CartItem() {
//
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public String toString() {
//		return  "\t " + "Quantity: " + quantity;
//	}
//
//}
>>>>>>> 19bc85c7b2d6214a5f06268993be2bed932fefed
