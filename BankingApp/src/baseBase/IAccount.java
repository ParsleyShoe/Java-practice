package baseBase;

public interface IAccount {

	public boolean checkAmountGTZero(double amount);
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean transfer(Account to, double amount);
	public void display();
	
	public String toString();
}
