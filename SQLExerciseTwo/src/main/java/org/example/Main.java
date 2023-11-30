package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://developer@127.0.0.1:3306/newdb";
        String username = "developer";
        String password = "Labefana1";


        try {
            Connection connection = myConnector(url,username,password);
            Statement statement = connection.createStatement();
            tableCreator(statement);
            studentAdder(statement, "Rossi", "Mario");
            studentAdder(statement, "Bianchi", "Paolo");
            studentAdder(statement, "Innocenzi", "Vincenzina");
            studentAdder(statement, "Inzerillo", "Andrea");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection myConnector(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void tableCreator(Statement statement) throws SQLException {
        String query = "CREATE TABLE students (" +
                "ID INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                "last_name VARCHAR(30)," +
                "first_name VARCHAR(30)" +
                ")";
        statement.executeUpdate(query);
    }

    public static void studentAdder(Statement statement, String lastName, String firstName) throws SQLException {
        String query = "INSERT INTO students (last_name, first_name) VALUES ('" + lastName + "', '" + firstName + "')";
        statement.executeUpdate(query);
    }

}

//create a table students if not already existing with
//the following columns:
//student_id as integer (10 digits) that is NOT NULL AUTO_INCREMENT
//last_name as string (max 30 characters)
//first_name as string (max 30 characters)
//the constraint that students_pk is the PRIMARY KEY using only the column student_id
//populate the table with 4 random students
//remember that you need only to insert last_name and first_name because the primary key is auto-incremented
