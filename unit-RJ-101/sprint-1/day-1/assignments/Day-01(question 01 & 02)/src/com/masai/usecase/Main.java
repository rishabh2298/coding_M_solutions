package com.masai.usecase;

import java.lang.reflect.Constructor;

import com.masai.model.Student;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		
		// creating object of class by newInstance Method (Reflection API)
		
		
		Class class1 = Class.forName("com.masai.model.Student");
		
		
		Constructor[] constructors = class1.getDeclaredConstructors();
		
		
		Student student = (Student)constructors[0].newInstance();
		
		
	}

}
