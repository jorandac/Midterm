package grandcircus.co.midterm;

public class Drink extends Product {

	private String size;

	private String temperature;

	// Constructor using fields
	public Drink(String name, String description, double price, String category, String size, String temperature) {
		super(name, description, price, category);
		this.size = size;
		this.temperature = temperature;
	}

	// empty constructor
	public Drink() {

	}

	// Getters and Setters
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	// To String
	@Override
	public String toString() {
		return "Drink [size=" + size + ", temperature=" + temperature + "]";
	}

}
