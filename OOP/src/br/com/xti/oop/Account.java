package br.com.xti.oop;

public class Account {
	
	String customerName;
	double balance;
	
	void showBalance() {
		System.out.println(customerName + ", your balance is " + balance);
	}
	
	void withdraw(int withdrawValue) {
		balance -= withdrawValue;
	}
	
	void deposit(int depositValue) {
		balance += depositValue;
	}
	
	void transferTo(Account accDestination, int transferValue) {
		this.withdraw(transferValue);
		accDestination.deposit(transferValue);
	}
	
}
