package com.masai.question02;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new A();
		
		t1.start();

		System.out.println("Thread has started");
		
		synchronized (t1) {
			
			System.out.println("main thread is waiting");
		
			t1.wait();
			
			System.out.println("Main thread is resumming");
		
		}
		System.out.println("End of main");
	}

}
