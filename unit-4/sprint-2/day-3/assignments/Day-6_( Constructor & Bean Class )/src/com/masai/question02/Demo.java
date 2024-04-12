package com.masai.question02;

public class Demo {
	
	
	Demo(){
		this("Hello");
		System.out.println("Constructor with 0 Argument Demo()");
	}
	
	
	Demo(String s){
		this(10);
		System.out.println("Constructor with (String s) Argument");
	}
	
	
	Demo(int i){
		this(10.12f);
		System.out.println("Constructor with (Integer i) Argument");
	}
	
	
	Demo(float f){
		System.out.println("Constructor with (float f) Argument");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d1 = new Demo();
		
	}

}
