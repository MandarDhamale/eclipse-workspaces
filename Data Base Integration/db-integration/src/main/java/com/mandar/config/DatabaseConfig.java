package com.mandar.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {

//here we are getting an connection with the database object 
	
	public static Connection getConnection() {
		
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "root";
		Connection connection = null;

		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database successfully!");
		} catch (Exception e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            e.printStackTrace();
		}
		return connection;
		
		
	}

	
}
