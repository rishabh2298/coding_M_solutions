package com.masai.question04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.add("Hyderabad");
		cities.add("Chennai");
		
		
		PrintList pList = (city) -> {
			
			for(String c:city) {
				System.out.print(c);
			}
		};
		
		pList.display(cities);
	}
	
}
