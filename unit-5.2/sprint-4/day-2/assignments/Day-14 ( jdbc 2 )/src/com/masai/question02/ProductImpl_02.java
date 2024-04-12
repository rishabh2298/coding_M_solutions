package com.masai.question02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductImpl_02 {
	
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
		
			PreparedStatement ps = conn.prepareStatement(" insert into product(pid,pname) values(?,?)");
			
			System.out.println("Enter Product Id");
			int pid = input.nextInt();
			
			System.out.println("Enter Product Name");
			String pname = input.next();
			
			
			ps.setInt(1, pid);
			ps.setString(2, pname);
			
			int status = ps.executeUpdate();
			
			if(status>0) 
				System.out.println("1 Product has been inserted");
			else
				System.out.println("Fail to insert Product ");
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
