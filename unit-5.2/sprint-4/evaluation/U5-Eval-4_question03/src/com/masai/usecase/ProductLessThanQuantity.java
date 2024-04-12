package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.ProdcutDaoImpl;
import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;
import com.model.Product;

public class ProductLessThanQuantity {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Quantity");
		int quantity = input.nextInt();
		
		ProductDao pDao = new ProdcutDaoImpl();
		
		try {
			List<Product> products = pDao.getAllProductQuantityLessThan(quantity);
			
			if(products.size()>0)
				System.out.println(products);
			else {
				System.out.println("There is no product which has quantity less than "+quantity);
			}
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
