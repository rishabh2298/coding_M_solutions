package com.masai.main;

public class Demo {

	
	
	public Demo() {
		this("hello");
		System.out.println("This is 0 args of Demo");
	}
	
	public Demo(String s) {
		this(10);
		System.out.println("This is String const of Demo");
	}
	
	public Demo(int i) {
		this(20f);
		System.out.println("This is Integer const of Demo");
	}
	
	public Demo(float f) {
		System.out.println("This is float const of Demo");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		System.out.println(d1);
		
	}
	
}
