package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.ProdcutDaoImpl;
import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;
import com.mysql.cj.protocol.Message;

public class DeleteProductByProductName {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter product name need's to be deleted");
		String pname = inputScanner.next();
		
		ProductDao pDao = new ProdcutDaoImpl();
		
		try {
			String message = pDao.deleteProductByProductName(pname);
			
			System.out.println(message);
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
