package com.masai.question03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
	
	public Connection getConnection() {
		
		Connection conn = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/databaseName";
		
		
		try {
			conn = DriverManager.getConnection(url,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	
	}

}
