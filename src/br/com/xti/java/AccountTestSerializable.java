package br.com.xti.java;

import br.com.xti.oop.Account;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class AccountTestSerializable {
	
	static Charset chartset = StandardCharsets.UTF_8;
	static Path path = Paths.get("C://Temp//java_test//accounts.txt");
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("Client 1", 1000));
		accounts.add(new Account("Client 2", 2000));
		accounts.add(new Account("Client 3", 3000));
		accounts.add(new Account("Client 4", 4000));
		accounts.add(new Account("Client 99", 99000));
		
		writeAccounts(accounts);
		ArrayList<Account> accounts2 = readAccounts();
		for(Account acc : accounts2){
			System.out.println(acc.toString());
		}
		
	}
	
	// write accounts list
	public static void writeAccounts(ArrayList<Account> accounts) throws IOException {

		try(FileOutputStream fileOutputStream = new FileOutputStream("c:/temp/java_test/accounts.ser")){
			try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
				objectOutputStream.writeObject(accounts);
			}
	    }
	}
	
	// read accounts list
	public static ArrayList<Account> readAccounts() throws IOException, ClassNotFoundException {

		try(FileInputStream fileInputStream = new FileInputStream("c:/temp/java_test/accounts.ser")){
			try(ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
				return (ArrayList<Account>) objectInputStream.readObject();
			}
		}


	}

}
