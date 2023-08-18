package br.com.xti.jdbc;

public class Account {

    int number;
    String client;
    double balance;

    public Account(int number, String client, double balance){
        this.number = number;
        this.client = client;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "account number: " + number + ", "
                + "client: " + client + ", "
                + "balance: " + balance;
    }
}
