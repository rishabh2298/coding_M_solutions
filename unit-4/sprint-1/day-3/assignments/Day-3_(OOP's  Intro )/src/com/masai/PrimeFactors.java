package com.masai;

public class PrimeFactors {
	
	static void factors(int num) {
		if(num>=2 && num<=100) {
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					System.out.println("Prime factors of "+num+" = "+i);
				}
			}
		}
		else {
			System.out.println("Invalid Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		factors(105);
		factors(12);

	}

}
