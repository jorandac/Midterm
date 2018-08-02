package grandcircus.co.midterm;

public class Product {

		private String name;
		private String description;
		private double price;
		
		//constructor using fields
		public Product(String name, String description, double price) {
			super();
			this.name = name;
			this.description = description;
			this.price = price;
		}
		
		// empty constructor
		public Product() {
			
		}

		//getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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
			return "Product [name=" + name + ", description=" + description + ", price=" + price + "]";
		}
		
		
		
		
		
}
