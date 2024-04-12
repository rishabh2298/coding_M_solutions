package com.masai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;import org.hibernate.dialect.DB2390Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class DataBase {

	@Value("${db.Driver}")
	private String driverName;
	
	@Value("${db.Url}")
	private String url;
	
	@Value("${db.UserName}")
	private String userName;
	
	@Value("${db.Password}")
	private String userPassword;
	
	
	public void print() {
		System.out.println("Driver = "+driverName);
		System.out.println(url);
		System.out.println(userName);
		System.out.println(userPassword);
	}
	
	
	public Connection provideConnection() {
		
		
		Connection connection = null;
		
		
		// driver loaded to primary memory
		
		try {
			Class.forName(driverName);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		// Making connection between driver and database
		
		try {
			connection = DriverManager.getConnection(url,userName,userPassword);
			
			System.out.println("Connection is successfully made......");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
	}

}
