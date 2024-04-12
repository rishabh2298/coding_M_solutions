package com.masai.question03;

public class Main {

	public int methodReferance(String s2) {
		
		System.out.println("Inside example of method referance");
		
		return Integer.parseInt(s2);
	}
	
	public static void main(String[] args) {
		
		X x1 = new Main()::methodReferance;
		
		System.out.println(x1.converStringToNumber("30"));
	}
	
}
