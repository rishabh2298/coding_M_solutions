package com.masai.service;

public class X {
	
	
	private X() {
		System.out.println("inside the private Constructor");
	}
	
	
	public static X getXObject() {
		
		System.out.println("inside getXObject of X class");
		
		return new X();
	}
	
	
	public void funX() {
		System.out.println("inside funX of X");
	}
	

}
