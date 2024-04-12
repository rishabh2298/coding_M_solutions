package com.masai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	
	public static Connection provideConnection() {
		
		// load Driver to memory
		try {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/universityDB";
		
		
		Connection connection = null;
		
		try {
		
			connection = DriverManager.getConnection(url, "root", "root");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return connection;

	}

}
