package grandcircus.co.midterm;

public class Cash extends Payment {

	// Class variables
	private double changeDue;

	// Default Constructor

	public Cash() {

	}

	// Constructor
	Cash(String paymentType, double amount, double changeDue) {
		super(paymentType, amount);
		this.changeDue = changeDue;
	}

	// Getter
	public double getChangeDue() {
		return changeDue;
	}

	// Setter
	public void setChangeDue(double changeDue) {
		this.changeDue = changeDue;
	}

	// To String
	@Override
	public String toString() {
		return "Cash [changeDue=" + changeDue + "]";
	}
}
