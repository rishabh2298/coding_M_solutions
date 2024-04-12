package com.masai.question02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Banglore");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Gurugram");
		list.add("Lacknow");
		list.add("Hyderabad");
		
		Comparator<String> comparator = (s1,s2) -> s2.compareTo(s1);
		
		TreeSet<String> tSet = new TreeSet<>(comparator);
		tSet.addAll(list);
		
		for(String city: tSet) {
			System.out.println(city);
		}
	}
	
}
