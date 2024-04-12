package com.masai.question02;

public class A extends Thread {

	public synchronized void solve(){
		
		int n = 1;

		for(int i=1; i<=10; i++) {
			n *= i ;
		}
		
		System.out.println("Producnt of 1 to 10");
		System.out.println(n);
		

		notify();
	}
	
	@Override
	public void run() {
		solve();
	}
	
}
