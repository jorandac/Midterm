package grandcircus.co.midterm;

public class Product {

	private String name;
	private String description;
	private double price;
	private String category;
	private int quantity;

	// constructor using fields
	public Product(String name, String description, double price, String category, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}

	// empty constructor
	public Product() {

	}

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return name + ": $" + price + " \n\t" + description;
	}

//	public String toString2() {
//
//		return name + ": $" + price + " \n\t";
//	}

}
