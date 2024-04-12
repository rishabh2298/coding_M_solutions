package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;
import com.model.Product;
import com.masai.dao.ProdcutDaoImpl;

public class AddProduct {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Details of Product");
		System.out.println();
		
		System.out.println("Enter Product Id");
		int productId = input.nextInt();
		
		System.out.println("Enter Product Name");
		String productName = input.next();
		
		System.out.println("Enter Product Price");
		int price = input.nextInt();
		
		System.out.println("Enter Product Quantity");
		int quantity = input.nextInt();
		
		Product product = new Product(productId, productName, price, quantity);
		
		ProductDao pDao = new ProdcutDaoImpl();
		
		String message = null;
		
		try {
			message = pDao.addProduct(product);
		} catch (ProductException e) {
			e.getMessage();
		}
		
		System.out.println(message);
		
	}

}
