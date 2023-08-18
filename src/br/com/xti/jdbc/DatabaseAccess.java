package br.com.xti.jdbc;

import java.sql.*;

public class DatabaseAccess {
    public static void main(String[] args) throws SQLException {

        String sql = "SELECT CODIGO, NOME, SEXO, EMAIL FROM PESSOA";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        try (
            Connection connection = DriverManager.getConnection(url, "xti", "xti123");
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()){

            while(resultSet.next()){
                String s = resultSet.getString("CODIGO")
                        + "; " + resultSet.getString("NOME")
                        + "; " + resultSet.getString("SEXO")
                        + "; " + resultSet.getString("EMAIL");

                System.out.println(s);
            }

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
