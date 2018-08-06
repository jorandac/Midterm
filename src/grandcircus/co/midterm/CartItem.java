package grandcircus.co.midterm;

public class CartItem {
	
	private Product product;

	private int quantity;

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public CartItem () {
		
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

	@Override
	public String toString() {
		return product + ", " + "Quantity: " + quantity;
	}
	
	
	
}
