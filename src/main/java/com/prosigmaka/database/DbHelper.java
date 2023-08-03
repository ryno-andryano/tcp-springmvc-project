package com.prosigmaka.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DbHelper {
    private static Connection connection;
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/universitas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        if (connection == null) connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        return connection;
    }
}
