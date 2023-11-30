package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://developer@127.0.0.1:3306/newdb";
        String username = "developer";
        String password = "Labefana1";


        try {
            Connection connection = myConnector(url, username, password);
            Statement statement = connection.createStatement();
            addColumn(statement);
            modifyNationality(statement,"Italy", "Germany");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection myConnector(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void addColumn (Statement statement) throws SQLException {
        String query = "ALTER TABLE students" +
                " ADD COLUMN country VARCHAR(30);";
        statement.executeUpdate(query);
    }

    public static void modifyNationality(Statement statement, String str1, String str2) throws SQLException {
        String query = "UPDATE students" +
                " SET country = CASE" +
                " WHEN ID BETWEEN 1 and 2 THEN '" + str1 + "'" +
                " WHEN ID BETWEEN 3 and 4 THEN '" + str2 + "'" +
                " ELSE country" +
                " END";
        statement.executeUpdate(query);
    }
}

//use JDBC for executing a query on the jdbc:mysql://localhost:3306/newdb database that:
//adds a new string column of 30 chars called country to the students table
//populate the new column with Italy for 2 students and Germany for the other 2 students