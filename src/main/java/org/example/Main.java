package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String user = "postgres";
    private static final String password = "sql2003";
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";


    public static void main(String[] args) throws SQLException {

        Connection connection  = DriverManager.getConnection(url,user, password);

    }
}