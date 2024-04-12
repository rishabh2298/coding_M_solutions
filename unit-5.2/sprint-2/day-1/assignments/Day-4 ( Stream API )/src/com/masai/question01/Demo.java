package com.masai.question01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11, "Shoes", 1600, 15));
		list.add(new Product(12, "Jeans", 1100, 20));
		list.add(new Product(13, "Bracelete", 5100, 5));
		list.add(new Product(14, "Utensiles", 2500, 10));
		list.add(new Product(15, "Table", 1800, 8));
		
		List<Product> filterList = list.stream().filter(s -> s.getQuantity() > 10).collect(Collectors.toList());
		
		Comparator<Product> comparator = (p1,p2) -> p1.getPrice() > p2.getPrice() ? 1: -1;
		
		Collections.sort(filterList,comparator);
		
		list.forEach(s -> System.out.println(s));
		
		System.out.println("================================================");
		
		filterList.forEach(s -> System.out.println(s));
	
	}

}
