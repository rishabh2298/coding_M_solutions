package com.masai;

public class NaturalNumberSum {
	
	static void sumOfNumber(int N) {
		
		int sum = (N*(N+1)/2);
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumOfNumber(5);
		sumOfNumber(10);
		sumOfNumber(15);

	}

}
