package com.masai.question02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductImpl_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:mysql://localhost:3306/jdbcday02";
		
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","root");
		
			Statement st = conn.createStatement();
			
			
			System.out.println("Enter Product Id that need to be updated");
			int id = input.nextInt();
			
			System.out.println("Enter new price of product");
			int price = input.nextInt();
			
			System.out.println("Enter new quantity of product");
			int quantity = input.nextInt();
			
			
			int status = st.executeUpdate("update product set price="+price+",quantity="+quantity+" where pid="+id+"");
			
			
			if(status>0)
				System.out.println("Your update has been done successfully");
			else 
				System.out.println("Update fail...");
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}
	
}
