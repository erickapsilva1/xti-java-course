package br.com.xti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "INSERT INTO PESSOA VALUES (?, ?, ?, ?)";
        String[] people = {"How", "Sheldon", "Leonard", "Rajesh", "Howard"};

        try(Connection connection = DriverManager.getConnection(url, "xti", "xti123");
        PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            for(int i = 0; i < people.length; i++){
                preparedStatement.setInt(1, i + 4);
                preparedStatement.setString(2, people[i]);
                preparedStatement.setString(3, "M");
                preparedStatement.setString(4, people[i].toLowerCase() + "@xti.com.br");
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (Exception exception){}
    }
}
