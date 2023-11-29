package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://developer@127.0.0.1:3306/newdb";
        String username = "developer";
        String password = "Labefana1";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println(resultSetHandler(selectNamesAndSurnames(connection)).toString());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ResultSet selectNamesAndSurnames (Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT first_name, last_name" +
                " FROM students";
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
    }

    public static ArrayList<String> resultSetHandler (ResultSet resultSet) throws SQLException {
        ArrayList<String> lastNameBox = new ArrayList<>();
        while (resultSet.next()) {
            String firstName = resultSet.getString("first_name");
            System.out.println(firstName);

            String lastName = resultSet.getString("last_name");
            lastNameBox.add(lastName);
        }
        return lastNameBox;
    }
}

//use JDBC for executing the following query on the jdbc:mysql://localhost:3306/newdb database:
//take the names and surnames of all the students (using ResultSet and its .next() method) and:
//print the names on screen while executing the query
//assign the surnames to an ArrayList called surnames
//once the query is completed, print all the surnames