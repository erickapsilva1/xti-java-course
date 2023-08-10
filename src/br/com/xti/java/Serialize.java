package br.com.xti.java;

import br.com.xti.oop.Account;

import java.io.*;
import java.util.Arrays;

public class Serialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] names = {"Tiburcio", "Esperidiao", "Alipio"};

        Account account = new Account("Client 1", 19554.87);
        Account account2 = new Account("Client 2", 5235424.27);
        Account account3 = new Account("Client 3", 4564.23);
        Account account4 = new Account("Client 4", 25874.53);


        // Write
        FileOutputStream fileOutputStream = new FileOutputStream("c:/temp/java_test/file99.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(account);
        objectOutputStream.writeObject(account2);
        objectOutputStream.writeObject(account3);
        objectOutputStream.writeObject(account4);
        objectOutputStream.close();

        // Read
        FileInputStream fileInputStream = new FileInputStream("c:/temp/java_test/file99.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Account acc = (Account) objectInputStream.readObject();
        Account acc2 = (Account) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(acc.toString());
        System.out.println(acc2.toString());

        FileInputStream fileInputStream2 = new FileInputStream("c:/temp/java_test/file99.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);

        for(int i = 0; i < 2; i++){
            objectInputStream2.readObject();
        }

        Account secondAccount = (Account) objectInputStream2.readObject();
        objectInputStream2.close();
        System.out.println(secondAccount.toString());

    }

}
