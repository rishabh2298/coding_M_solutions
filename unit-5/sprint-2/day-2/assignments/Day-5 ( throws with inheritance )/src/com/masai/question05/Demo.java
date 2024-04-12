package com.masai.question05;

import java.awt.color.ProfileDataException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(11, "Shoes", 3, 800));
		list.add(new Product(12, "Shirt", 10, 400));
		list.add(new Product(13, "Racket", 5, 1200));
		list.add(new Product(14, "speaker", 7, 1700));
		list.add(new Product(15, "bat", 16, 1000));
		
		Comparator<Product> comparator = (s1,s2) -> s1.getPrice()>s2.getPrice()? -1: 1;
		
		TreeSet<Product> tSet = new TreeSet<>(comparator);
		tSet.addAll(list);
		
		for(Product p: tSet) {
			System.out.println(p);
		}
	}
}
