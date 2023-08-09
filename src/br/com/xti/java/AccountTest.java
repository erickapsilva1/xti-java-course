package br.com.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.oop.Account;

public class AccountTest {
	
	static Charset chartset = StandardCharsets.UTF_8;
	static Path path = Paths.get("C://Temp//java_test//accounts.txt");
	
	public static void main(String[] args) {
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Client 1", 1000));
		accounts.add(new Account("Client 2", 2000));
		accounts.add(new Account("Client 3", 3000));
		accounts.add(new Account("Client 4", 4000));
		accounts.add(new Account("Client 99", 99000));
		
		writeAccounts(accounts);
		readAccounts();
		
	}
	
	// write accounts list
	public static void writeAccounts(ArrayList<Account> accounts) {
		try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path, chartset)){
			for(Account account : accounts) {
				bufferedWriter.write(account.getCustomerName() + ";" + account.getBalance() + "\n");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	// read accounts list
	public static void readAccounts() {
		ArrayList<Account> accountsFile = new ArrayList<Account>();
		
		try(BufferedReader bufferedReader = Files.newBufferedReader(path, chartset)){
			String line = null;
			String[] accountInfo = null;
			while((line = bufferedReader.readLine()) != null) {
				accountInfo = line.split(";");
				accountsFile.add(new Account(accountInfo[0], Double.valueOf(accountInfo[1])));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(Account acc : accountsFile) {
			System.out.println(acc);
		}
	}

}
