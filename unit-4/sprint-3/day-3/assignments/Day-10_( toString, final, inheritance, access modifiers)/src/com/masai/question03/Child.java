package com.masai.question03;

import java.util.Scanner;

public final class Child extends Parent{
	
	Child(int number){
		super(number);
	}
	
	@Override
	void method1() {
		System.out.println("This is overriden method-1 of child class");
		super.method1();
	}

	void method4(){
		System.out.println("This is method-4 of Child class");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number between 1 to 10 : ");
		int num = scanner.nextInt();
		
		if(num>=0 && num<=10) {
			Parent parent = new Child(num);
			
			parent.method1();
			parent.method2();
			parent.method3();
			
			Child child = (Child)parent;
			
			child.method4();
		}
		else {
			System.out.println("Invalid Number");
		}
		scanner.close();
		
	}
	
}
