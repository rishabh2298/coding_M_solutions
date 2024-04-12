package com.masai.question03;

import java.util.concurrent.Callable;

public class D implements Callable<Integer>{

	int num;
	
	public D(int n) {
		this.num = n;
	}
	
	@Override
	public Integer call() throws Exception {
		
		int product = 1;
		
		for(int i=1; i<=this.num; i++) {
			product *= i;
		}
		
		return product;
	}

	
	
}
