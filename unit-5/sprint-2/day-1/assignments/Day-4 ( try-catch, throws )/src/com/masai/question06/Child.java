package com.masai.question06;

public class Child extends Parent{

	public Child() throws Exception {
		super();
		System.out.println("Inside child construtor");
	}

	public static void main(String[] args) {
		
		try {
			
			new Child().fun1();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
