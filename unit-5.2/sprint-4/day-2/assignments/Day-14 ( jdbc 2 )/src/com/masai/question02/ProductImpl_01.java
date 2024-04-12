package com.masai.question02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductImpl_01 {
	
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
			
			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?)");

			int count = 1;
			
			while(count<=5) {

				System.out.println("Enter Product"+count+" Id");
				int pid = input.nextInt();
				
				System.out.println("Enter Product"+count+" Name");
				String pname = input.next();
				
				System.out.println("Enter Product"+count+" Quantity");
				int quantity = input.nextInt();
				
				System.out.println("Enter Product"+count+" Price");
				int price = input.nextInt();
				
				
				ps.setInt(1, pid);
				ps.setString(2, pname);
				ps.setInt(3, quantity);
				ps.setInt(4, price);
				
				
				int status = ps.executeUpdate();
				
				if(status>0)
					System.out.println("Product "+count+" has been inserted");
				else
					System.out.println("Fail to insert product in database");
				
				count++;
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());;
		}
		
		input.close();
	}

}
