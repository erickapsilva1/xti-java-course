package br.com.xti.oop;

public class AccountTest {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.customerName = "Altschul";
		acc.balance = 10000.00;
		
		Account acc2 = new Account();
		acc2.customerName = "Cabete";
		acc2.balance = 1;
		
		acc.showBalance();
		acc2.showBalance();
		
		acc.withdraw(100);
		acc.showBalance();
		
		acc.deposit(1000);
		acc.showBalance();
		
		acc.transferTo(acc2, 10000);
		acc.showBalance();
		acc2.showBalance();
	}

}
