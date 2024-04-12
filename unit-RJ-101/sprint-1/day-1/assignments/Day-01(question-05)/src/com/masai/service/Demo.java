package com.masai.service;

import java.lang.reflect.Constructor;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		// Approach-1 ( newInstance method)
		
		System.out.println("Approach-1");
		
		Class class1 = Class.forName("com.masai.service.X");
		
		Constructor[] constructors = class1.getDeclaredConstructors();
		
		
		constructors[0].setAccessible(true); 		// to get private/default/parameterized/ constructors
		
		X x1 = (X)constructors[0].newInstance();
		
		x1.funX();


		System.out.println("===========================");
		
		
		// Approach-2 (static factory method)
		
		System.out.println("Approach-2");
		
		X x2 = X.getXObject();
		
		x2.funX();
		
	}
	
}
