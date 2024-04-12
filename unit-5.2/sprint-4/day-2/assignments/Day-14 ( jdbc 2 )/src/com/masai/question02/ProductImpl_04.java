package com.masai.question02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductImpl_04 {
	
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
		
			System.out.println("Enter quantity below which data will be deleted");
			int quantity = input.nextInt();
			
			PreparedStatement ps = conn.prepareStatement(" delete from product where quantity<"+quantity+"");
			
			int status = ps.executeUpdate();
			
			if(status>0)
				System.out.println("products less than "+quantity+" has been deleted successfully");
			else 
				System.out.println("No such product found that has less quantity "+quantity);
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
		
	}

}
