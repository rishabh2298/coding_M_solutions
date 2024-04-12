package com.masai.question04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11, "Shoes", 6, 700));
		list.add(new Product(12, "Bags", 20, 450));
		list.add(new Product(13, "Jeans", 16, 1100));
		list.add(new Product(14, "Balls", 40, 850));
		list.add(new Product(15, "Toys", 10, 200));
		
		
		Set<Product> set = new TreeSet<>((p1,p2) -> p1.getPrice() > p2.getPrice()? -1: 1);
		set.addAll(list);
		
		
		for(Product p:set) {
			
			Product ans = p;

			System.out.println("Product Id = "+ ans.getProductId());
			System.out.println("Product Name = "+ ans.getProductName());
			System.out.println("Product Price = "+ ans.getPrice());
			System.out.println();
			
		}
		
	}

}
