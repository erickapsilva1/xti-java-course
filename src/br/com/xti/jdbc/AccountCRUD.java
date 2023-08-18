package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountCRUD {

    public void create(Connection connection, Account account) throws SQLException {
        String sql = "INSERT INTO CONTA VALUES (?, ?, ?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, account.number);
            preparedStatement.setString(2, account.client);
            preparedStatement.setDouble(3, account.balance);
            preparedStatement.executeUpdate();
        }
    }

    public void change(Connection connection, Account account) throws SQLException {
        String sql = "UPDATE CONTA SET CLIENTE=?, SALDO=? WHERE NUMERO=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, account.client);
            preparedStatement.setDouble(2, account.balance);
            preparedStatement.setInt(3, account.number);
            preparedStatement.executeUpdate();
        }
    }

    public void delete(Connection connection, Account account) throws SQLException {
        String sql = "DELETE FROM CONTA WHERE NUMERO=?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, account.number);
            preparedStatement.executeUpdate();
        }
    }

    public List<Account> read(Connection connection) throws SQLException {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT NUMERO, CLIENTE, SALDO FROM CONTA";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()){
                accounts.add(new Account(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getDouble(3))
                );
            }
        }
        return accounts;
    }

}
