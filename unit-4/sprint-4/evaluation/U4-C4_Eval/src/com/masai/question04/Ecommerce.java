package com.masai.question04;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList = new ArrayList<>();
	
	void addProductToList(Product product) {
		
		for(Product mainProduct:productList) {
			if(mainProduct.getName()==product.getName()) {
				product.setCount(product.getCount());
				System.out.println("Count updated Product already exists");
				return;
			}
		}
		productList.add(product);
		System.out.println("Product added successfully");
	}
	
	List<Product> showAllProduct(){
		return productList;
	}

}
