package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ProdcutDaoImpl;
import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;

public class AddProductQuantity {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Product Id");
		int productId = input.nextInt();
		
		System.out.println("Entr Product Quantity");
		int quantity = input.nextInt();
		
		ProductDao pDao = new ProdcutDaoImpl();
		
		try {
			String message = pDao.addProductQuantity(productId, quantity);
			
			System.out.println(message);
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
