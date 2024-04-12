package com.masai.question03;

public class Main {
	
	static int productUptoNumber(int num) {
		int product = 1;
		for(int i=1; i<=num; i++) {
			product *= i;
		}
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = productUptoNumber(5);
		System.out.println(result);
		
	}

}
