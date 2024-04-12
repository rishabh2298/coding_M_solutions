package com.masai.question01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Delhi","Banglore","Mumbai","Gurugram","Chennai","Hydrabad");
		
		Comparator<String> comparator = (c1,c2) -> c2.compareToIgnoreCase(c1);
		
		Set<String> tSet = new TreeSet<>(comparator);
		tSet.addAll(cities);
		
		System.out.println(tSet);
	}
	
}
