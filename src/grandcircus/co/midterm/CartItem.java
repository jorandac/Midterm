package grandcircus.co.midterm;

public class CartItem extends Product {

	private Product product;

	// Class variables
	private int quantity;

	private double price;

	// Constructors
	public CartItem(Product product, int quantity, double price) {

		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public CartItem() {

	}

	// Getters and Setters
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

	// ToString
	@Override
	public String toString() {
		return product + "\t " + "Quantity: " + quantity;
	}

}
