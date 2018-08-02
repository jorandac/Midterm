package grandcircus.co.midterm;

public class Check extends Payment {

	private int checkNum;

	//constructor
	public Check(String paymentType, double amount, int checkNum) {
		super(paymentType, amount);
		this.checkNum = checkNum;
	}
	
	//empty constructor
	public Check() {
		
	}

	// getter
	public int getCheckNum() {
		return checkNum;
	}

	//setter
	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	@Override
	public String toString() {
		return "Check [checkNum=" + checkNum + "]";
	}
	
	
	
	
}
