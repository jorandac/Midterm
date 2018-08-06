package grandcircus.co.midterm;

public class Sandwich extends Product {

	private String bread;
	private String cheese;
	private String meat;
	private String egg;

	// Default Constructor
	public Sandwich() {

	}

	// Constructor using fields
	public Sandwich(String name, String description, double price, String category, String bread, String cheese,
			String meat, String egg) {
		super(name, description, price, category);
		this.bread = bread;
		this.cheese = cheese;
		this.meat = meat;
		this.egg = egg;
	}

	// Getters and Setters
	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String isEgg() {
		return egg;
	}

	public void setEgg(String egg) {
		this.egg = egg;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + "\n" + "Bread: " + bread + ", Cheese: " + cheese + ", Meat: " + meat + ", Egg: " + egg
				+ ", ";
	}

}
