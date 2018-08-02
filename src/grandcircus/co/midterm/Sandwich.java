package grandcircus.co.midterm;

public class Sandwich extends Product {
 
	private String bread; 
	private String cheese; 
	private String meat; 
	private boolean egg;
	
	//Default Constructor 
	public Sandwich() { 
		
	}
	
	//Constructor using fields 
	public Sandwich(String name, String description, double price, String bread, String cheese, String meat,
			boolean egg) {
		super(name, description, price);
		this.bread = bread;
		this.cheese = cheese;
		this.meat = meat;
		this.egg = egg;
	}
	
	//Getters and Setters
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
	public boolean isEgg() {
		return egg;
	}
	public void setEgg(boolean egg) {
		this.egg = egg;
	}

	//toString 
	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", cheese=" + cheese + ", meat=" + meat + ", egg=" + egg + "]";
	} 

}
