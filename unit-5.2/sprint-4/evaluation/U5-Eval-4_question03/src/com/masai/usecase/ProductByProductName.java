package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ProdcutDaoImpl;
import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;
import com.model.Product;

public class ProductByProductName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name of product");
		String pname = input.next();
		
		ProductDao pDao = new ProdcutDaoImpl();
		
		try {
			Product product = pDao.getProductByProductName(pname);
			
			System.out.println(product);
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
