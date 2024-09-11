package org.pmsa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectivity {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhoste:3306/AppGestion";
        String user = "root";
        String pswd = "rout";

        Connection  connection = DriverManager.getConnection(url, user, pswd);
    }

}
