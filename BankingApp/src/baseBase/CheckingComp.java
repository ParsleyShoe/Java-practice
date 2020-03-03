package baseBase;

public class CheckingComp implements IAccount {

	public Account account;

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
	
	public CheckingComp() {
		setAccount(new Account());
		account.setNickname("Checking Account");
	}
	
	public String toString() {
		return account.toString();
	}
}

//to get this class to work, you must make Account class not abstract and change the access for the checkAmountGTZero() method to "package"