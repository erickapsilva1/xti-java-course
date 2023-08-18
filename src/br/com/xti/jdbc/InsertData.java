package br.com.xti.jdbc;

import java.sql.*;

public class InsertData {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "INSERT INTO PESSOA VALUES (?, ?, ?, ?)";
        String[] people = {"How", "Sheldon", "Leonard", "Rajesh", "Howard"};

        try(Connection connection = DriverManager.getConnection(url, "xti", "xti123")){
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                for (int i = 0; i < people.length; i++) {
                    preparedStatement.setInt(1, i + 4);
                    preparedStatement.setString(2, people[i]);
                    preparedStatement.setString(3, "M");
                    preparedStatement.setString(4, people[i].toLowerCase() + "@xti.com.br");
                    preparedStatement.addBatch();
                } preparedStatement.executeBatch();
            }catch (SQLException exception) {}
            sql = "SELECT NOME, EMAIL FROM PESSOA ORDER BY 1 ASC";

            try(PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement1.executeQuery(sql)){
                while (resultSet.next()){
                    System.out.println(resultSet.getString(1) + ": " + resultSet.getString(2));
                }
            }
        } catch (Exception exception){}
    }
}
