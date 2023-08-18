package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "INSERT INTO PESSOA VALUES (3, 'Hermione', 'F', 'hermione@xti.com.br')";

        try(Connection connection = DriverManager.getConnection(url, "xti", "xti123");
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.executeUpdate();
        } catch (Exception exception){}
    }
}
