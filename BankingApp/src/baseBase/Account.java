package baseBase;

public class Account {
	
	private static int nextNumber = 1000;
	private static int ACCT_INCR = 1000;
	
	private double _balance = 0;
	private int _number;
	private String _nickname;
	
	public static int getNextNumber() {
		return nextNumber;
	}
	public void setNextNumber(int nextNumber) {
		Account.nextNumber = nextNumber;
	}
	public double getBalance() {
		return _balance;
	}
	public void setBalance(double balance) {
		this._balance = balance;
	}
	public int getNumber() {
		return _number;
	}
	public void setNumber(int number) {
		this._number = number;
	}
	public String getNickname() {
		return _nickname;
	}
	public void setNickname(String nickname) {
		this._nickname = nickname;
	}
	
	
	boolean checkAmountGTZero(double amount) {
		if (amount <= 0) {
			return false;
		} return true;
	}
	public boolean deposit(double amount) {
		if (!checkAmountGTZero(amount)) {
			System.out.println("Amount must be greater than 0.");
			return false;
		}
		setBalance(getBalance() + amount);
		return true;
	}
	public boolean withdraw(double amount) {
		if (!checkAmountGTZero(amount) || amount > getBalance()) {
			System.out.println("Amount must be greater than 0 and less than current balance.");
			return false;
		}
		setBalance(getBalance() - amount);
		return true;
	}
	public boolean transfer(Account to, double amount) {
		if (this.withdraw(amount)) {
			to.deposit(amount);
			return true;
		}
		return false;
	}
	public void display() {
		System.out.println(this.getNumber());
		System.out.println(this.getBalance());
		System.out.println(this.getNickname());
		System.out.println();
	}
	
	public String toString() {
		return String.format("%d | %s | %-9.2f", _number, _nickname, _balance); // left justify, 9 total digits, 2 decimal points
	}
	
	public Account() {
		this.setNumber(getNextNumber());
		this.setNextNumber(getNextNumber() + ACCT_INCR);
	}
}
