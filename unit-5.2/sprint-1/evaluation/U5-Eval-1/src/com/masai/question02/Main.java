package com.masai.question02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11, "Pen", 10, 5));
		list.add(new Product(12, "Pencil", 7, 15));
		list.add(new Product(13, "Rubber", 4, 4));
		list.add(new Product(14, "Sharpner", 10, 1));
		list.add(new Product(15, "Scale", 15, 3));
		list.add(new Product(16, "Compass", 30, 1));
		
		
//		System.out.println("Filter product less than 2 quantity");
//		System.out.println();
		
		Predicate<Product> predicate = p -> p.getQuantity() < 2; 

//		for(Product p:list) {
//			if(predicate.test(p)) {
//				System.out.println(p);
//			}
//		}
		
		list.removeIf(predicate);
		
//		System.out.println("=================================");
//		System.out.println();
		
//		System.out.println("sort by price in decreasing");
//		System.out.println();
		
		Collections.sort(list, (p1,p2) -> p1.getPrice() > p2.getPrice() ? -1: 1);
		
//		System.out.println(list);
		
//		System.out.println("======================================");
//		System.out.println();
		
//		System.out.println("Print by using MR");
		
		Consumer<Product> myPrint = System.out :: println;
		
		for(Product p:list) {
			myPrint.accept(p);
		}
		
	}
	
}
