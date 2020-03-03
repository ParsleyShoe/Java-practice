package baseBase;

public class Savings extends Account {

	private double _interestRate = 0.0035; // default is 0.35%

	public double getInterestRate() {
		return _interestRate;
	}
	private void setInterestRate(double interestRate) {
		_interestRate = interestRate;
	}

	public void calculateInterest(int months) {
		deposit(getBalance() * (getInterestRate() / 12) * months);
	}
	
	public Savings(String nickname) {
		this();
		setNickname(nickname);
	}
	public Savings(String nickname, double interest) {
		this(nickname);
		setInterestRate(interest);
	}
	public Savings(double interest) {
		this();
		setInterestRate(interest);
	}
	public Savings() {
		super();
		setNickname("Savings Account");
	}
}
