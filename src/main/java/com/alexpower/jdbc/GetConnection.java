package com.alexpower.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    public static Connection getConnection() throws Exception {
        // set driver
    	Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&rewriteBatchedStatements=true&useServerPrepStmts=false";
        
        Connection connection = DriverManager.getConnection(url, "root", "Oracle3*+");
        
        System.out.println(connection);

        // return connection
        return connection;
    }
}

