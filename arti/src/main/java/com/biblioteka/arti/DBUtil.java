package com.biblioteka.arti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {

    private static boolean isDriverLoaded = true;

    static final String url ="jdbc:mysql://localhost:3306/employee?useSSL=false";
    static final String user = "root";
    static final String password = "12345";

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        if(isDriverLoaded) {
            con  = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established");
        }
        return con;
    }

    public static void closeConnection(Connection con) throws SQLException {
        if(con != null) {
            con.close();
            System.out.println("Connection closed");
        }
    }
}
