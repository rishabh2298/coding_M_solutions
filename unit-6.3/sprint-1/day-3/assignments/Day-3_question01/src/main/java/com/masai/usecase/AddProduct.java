package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.DaoMethod;
import com.masai.dao.DaoMethodImpl;
import com.masai.entity.Product;

public class AddProduct {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Product Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter Product Quantity");
		int quantity = scanner.nextInt();
		
		System.out.println("Enter Product Price");
		int price = scanner.nextInt();
		
		
		
		DaoMethod dao = new DaoMethodImpl();
		
		Product product = new Product(name, quantity, price);
		
		System.out.println(dao.addProduct(product));
		
		scanner.close();
	}

}
