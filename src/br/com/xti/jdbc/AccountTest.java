package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class AccountTest {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try(Connection connection = DriverManager.getConnection(url, "xti", "xti123")){
            AccountCRUD crud = new AccountCRUD();

            Account account1 = new Account(1, "Nebbie", 1000.11);
            Account account2 = new Account(2, "Luneta", 2000.22);
            Account account3 = new Account(3, "How", 3000.33);

            // CREATE
//            crud.create(connection, account1);
//            crud.create(connection, account2);
//            crud.create(connection, account3);

            // CHANGE
            account1.balance = 9000.99;
            crud.change(connection, account1);

            // DELETE
            crud.delete(connection, account3);

            // LIST
            List<Account> accountList = crud.read(connection);
            for(Account account : accountList){
                System.out.println(account);
            }

        }

    }
}
