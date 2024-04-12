package com.masai.question03;

public class Parent {

	final int number;
	
	Parent(int num){
		this.number = num;
	}
	
	void method1() {
		System.out.println("This is method-1 of Parent class");
		System.out.println("Parent class number is : "+this.number);
	}
	
	final void method2() {
		System.out.println("This is method-2 of Parent class");
	}
	
	void method3() {
		System.out.println("This is method-3 of Parent class");
	}
	
}
