package br.com.xti.oop;

public class Account implements java.io.Serializable {
	
	public String customerName;
	transient double balance;
	
	public Account() {}
	public Account(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void showBalance() {
		System.out.println(customerName + ", your balance is " + balance);
	}
	
	void withdraw(int withdrawValue) {
		balance -= withdrawValue;
	}
	
	public void deposit(int depositValue) {
		balance += depositValue;
	}
	
	void transferTo(Account accDestination, int transferValue) {
		this.withdraw(transferValue);
		accDestination.deposit(transferValue);
	}
	
	@Override
	public String toString() {
		return "Customer Name: " + this.customerName + " | " + "Account Balace: " + this.balance;
	}
	
}
