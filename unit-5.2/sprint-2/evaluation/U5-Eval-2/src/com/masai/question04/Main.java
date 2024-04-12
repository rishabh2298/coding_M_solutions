package com.masai.question04;

public class Main {
	
	public static void main(String[] args) {
		
		Runnable forKohli = () -> {

			System.out.println("Thread name = "+Thread.currentThread().getName());
			
			for(int i=0; i<10; i++) {
				System.out.println(i+1);
			}
			
		};
		
		Runnable forRohit = () -> {
			
			System.out.println("Thread name = "+Thread.currentThread().getName());
			
			int product = 1;
			
			for(int i=1; i<=10; i++) {
				product *= i;
			}
			
			System.out.println("Product of 1 to 10 = "+product);
			
		};
		
		Runnable forDhoni = () -> {
			
			System.out.println("Thread name = "+Thread.currentThread().getName());
			
			int sum = 0;
			
			for(int i=1; i<=20; i++) {
				sum += i;
			}
			
			System.out.println("Addition of first 20 = "+sum);
		};
		
		Thread Kohli = new Thread(forKohli);
		Thread Rohit = new Thread(forRohit);
		Thread Dhoni = new Thread(forDhoni);
		
		Kohli.setName("Kohli");
		Rohit.setName("Rohit");
		Dhoni.setName("Dhoni");
		
		Dhoni.setPriority(10);
		Rohit.setPriority(8);
		Kohli.setPriority(6);
		
		Dhoni.start();
		Rohit.start();
		Kohli.start();
		
	}

}
