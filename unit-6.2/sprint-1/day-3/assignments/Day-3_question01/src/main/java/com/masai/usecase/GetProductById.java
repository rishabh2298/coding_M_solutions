package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.DaoMethod;
import com.masai.dao.DaoMethodImpl;

public class GetProductById {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter product Id to get details");
		int productId = scanner.nextInt();
		
		
		
		DaoMethod dao = new DaoMethodImpl();
		
		System.out.println(dao.getProductById(productId));
		
		scanner.close();
		
	}

}
