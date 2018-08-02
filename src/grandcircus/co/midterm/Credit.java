package grandcircus.co.midterm;

public class Credit extends Payment {

	// Class variables
	private String creditCardNumber;
	private String expirationDate;
	private String cvv;

	// Constructor using fields
	public Credit(String paymentType, double amount, String creditCardNumber, String experationDate, String cvv) {
		super(paymentType, amount);
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = experationDate;
		this.cvv = cvv;
	}

	// empty constructor
	public Credit() {

	}

	// Getters and setters
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExperationDate() {
		return expirationDate;
	}

	public void setExperationDate(String experationDate) {
		this.expirationDate = experationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Credit [creditCardNumber=" + creditCardNumber + ", experationDate=" + expirationDate + ", cvv=" + cvv
				+ "]";
	}

}
