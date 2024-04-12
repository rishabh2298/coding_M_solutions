package com.masai;

public class Cla {
	
	
	void factorial(int num) {
		int product = 1;
		for(int i=num; i>=1; i--) {
			product*=i;
		}
		System.out.println("Factorial of "+num+" = "+product);
	}
	
	
	void AbsoluteDifference(double a , double b) {
		double result;
		if(a>b) {
			result = a-b;
		}
		else if(b>a) {
			result = b-a;
		}
		else {
			result = 0;
		}
		System.out.println("Absolute Difference is = "+result);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cla cla = new Cla();
		
		if(args.length==1) {
			int num = Integer.parseInt(args[0]);
			cla.factorial(num);
		}
		else if(args.length==2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			cla.AbsoluteDifference(a, b);
		}
		else {
			System.out.println("Error");
		}

	}

}
