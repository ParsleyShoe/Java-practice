package baseBase;

public class SavingsComp implements IAccount {

	public Account account;
	private double _interestRate = 0.0035; // default is 0.35%

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public boolean checkAmountGTZero(double amount) {
		return account.checkAmountGTZero(amount);
	}
	public boolean deposit(double amount) {
		return account.deposit(amount);
	}
	public boolean withdraw(double amount) {
		return account.withdraw(amount);
	}
	public boolean transfer(Account to, double amount) {
		return account.transfer(to, amount);
	}
	public void display() {
		account.display();
	}
	

	public double getInterestRate() {
		return _interestRate;
	}
	private void setInterestRate(double interestRate) {
		_interestRate = interestRate;
	}

	public void calculateInterest(int months) {
		deposit(account.getBalance() * (getInterestRate() / 12) * months);
	}
	
	public SavingsComp(String nickname) {
		this();
		account.setNickname(nickname);
	}
	public SavingsComp(String nickname, double interest) {
		this(nickname);
		setInterestRate(interest);
	}
	public SavingsComp(double interest) {
		this();
		setInterestRate(interest);
	}
	public SavingsComp() {
		setAccount(new Account());
		account.setNickname("Savings Account");
	}
	
	public String toString() {
		return account.toString();
	}
	
}
