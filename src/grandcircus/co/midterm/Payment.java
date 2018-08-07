package grandcircus.co.midterm;

public class Payment {

	// Class Variables
	private String paymentType;
	private double amount;

	// constructor using fields
	public Payment(String paymentType, double amount) {
		super();
		this.paymentType = paymentType;
		this.amount = amount;
	}

	// empty constructor
	public Payment() {

	}

	// getters and setters
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
