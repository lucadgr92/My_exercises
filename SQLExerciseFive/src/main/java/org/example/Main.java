package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://developer@127.0.0.1:3306/newdb";
        String username = "developer";
        String password = "Labefana1";

        try {
            Connection connection = myConnector(url, username, password);
            Statement statement = connection.createStatement();
            viewMaker(connection, statement, "italian", "Italy");
            viewMaker(connection, statement, "german", "Germany");
            System.out.println(fromDbToArrayList(connection, statement, "italian_students").toString());
            System.out.println(fromDbToArrayList(connection, statement, "german_students").toString());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection myConnector(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static void viewMaker(Connection connection, Statement statement, String viewName, String nationality) throws SQLException {
        String query = "CREATE VIEW " + viewName + "_students AS" +
                " SELECT last_name, first_name" +
                " FROM students" +
                " WHERE country = '" + nationality + "';";
        statement.executeUpdate(query);
    }

    public static ArrayList<Student> fromDbToArrayList(Connection connection, Statement statement, String viewName) throws SQLException {
        ArrayList<Student> students = new ArrayList<>();
        String query = "SELECT * FROM " + viewName + ";";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()) {
            students.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
        }
        return students;
    }
}

//create a class Student that has:
//2 string properties:
//name
//surname
//a constructor for setting the 2 values
//getters methods
//use JDBC for executing the following queries on the jdbc:mysql://localhost:3306/newdb database:
//create a view italian_students that gets all the name and surname of the Italian students
//create a view german_students that gets all the name and surname of the German students
//execute a select using the italian_students and put the result in an ArrayList of Student objects called italianStudents
//execute a select using the german_students and put the result in an ArrayList of Student objects called germanStudents