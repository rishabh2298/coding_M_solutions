package com.masai.usecase;

import java.util.List;

import com.masai.dao.ProdcutDaoImpl;
import com.masai.dao.ProductDao;
import com.masai.exception.ProductException;
import com.model.Product;

public class GetAllProduct {
	
	public static void main(String[] args) {

		ProductDao pDao = new ProdcutDaoImpl();
		
		try {
			List<Product> products = pDao.getAllProducts();
			
			System.out.println(products);
			
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
