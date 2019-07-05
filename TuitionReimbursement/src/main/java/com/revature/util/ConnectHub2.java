package com.revature.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.postgresql.core.ConnectionFactory;

public class ConnectHub2 {
	
	
	private static String url;
	private static String user;
	private static String password;
    private static final String PROPERTIES_FILE = "database.properties";
    private static ConnectHub2 connectionFactory;
    
    public static synchronized Connection getConnection() {

        if (connectionFactory == null) {
            connectionFactory = new ConnectHub2();
        }

        return connectionFactory.createConnection();

    }

    private ConnectHub2() {

        Properties properties = new Properties();
        
        ClassLoader load = Thread.currentThread().getContextClassLoader();
        
        try (InputStream fis = load.getResourceAsStream(PROPERTIES_FILE);) {

            properties.load(fis);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();  
        }
    }

    private Connection createConnection() {
    	
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connection Successful!!");

        }  catch (ClassNotFoundException e) {
        
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            
            System.out.println("Connection Failed!");

        }

        return connection;

    }
    
    
}