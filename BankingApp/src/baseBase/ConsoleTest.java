package baseBase;

import java.util.ArrayList;

public class ConsoleTest {

	public static void main(String[] args) {

		Account account1 = new Checking("My Account");
		Account account2 = new Savings("save save save");
		
		Account account3 = new Checking();
		Account account4 = new Savings(1.2);
		
		Account account5 = new Checking("MASTER_ACCOUNT");
		
		account5.setBalance(2000);
		
		account1.deposit(50); // 50
		account2.deposit(150); // 150
		account3.deposit(200); // 200
		account4.deposit(75); // 75
		
		account1.withdraw(10); // 40
		account2.withdraw(40); // 110
		account3.withdraw(20); // 180
		account4.withdraw(13); //62
		
		account1.transfer(account2, 10); // 30, 210, 500
		account2.transfer(account3, 60); // 120, 60, 500
		account3.transfer(account4, 120); // 240, 120, 500
		account4.transfer(account1, 180); // 182, 2, 500
		
		account5.transfer(account1, 290); // 1710
		System.out.println(account5.getBalance());
		account5.transfer(account2, 440); // 1270
		System.out.println(account5.getBalance());
		account5.transfer(account3, 380); // 890
		System.out.println(account5.getBalance());
		account5.transfer(account4, 498); // 392
		System.out.println(account5.getBalance());
		System.out.println();
		
		IAccount iaccount1 = new CheckingComp();
		IAccount iaccount2 = new SavingsComp();
		IAccount iaccount3 = new CheckingComp();
		IAccount iaccount4 = new SavingsComp();
		
		ArrayList<IAccount> accounts = new ArrayList<IAccount>();
		accounts.add(iaccount1);
		accounts.add(iaccount2);
		accounts.add(iaccount3);
		accounts.add(iaccount4);
		for (IAccount a : accounts) {
			a.display();
		}
		
	}

}
