package grandcircus.co.midterm;

public class Credit extends Payment {

	// Class variables
	private String creditCardNumber;
	private String experationDate;
	private String cvv;

	// Constructor using fields
	public Credit(String paymentType, double amount, String creditCardNumber, String experationDate, String cvv) {
		super(paymentType, amount);
		this.creditCardNumber = creditCardNumber;
		this.experationDate = experationDate;
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
		return experationDate;
	}

	public void setExperationDate(String experationDate) {
		this.experationDate = experationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Credit [creditCardNumber=" + creditCardNumber + ", experationDate=" + experationDate + ", cvv=" + cvv
				+ "]";
	}

}
