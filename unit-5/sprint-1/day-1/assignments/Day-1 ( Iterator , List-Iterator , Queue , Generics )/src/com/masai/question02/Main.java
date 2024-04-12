package com.masai.question02;

import java.util.Scanner;
import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Product> pq = new PriorityQueue<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data y/n");
		String input = sc.next();
		
		while(!input.equalsIgnoreCase("n")) {
			System.out.print("Enter Product ID = ");
			int id = sc.nextInt();
			
			System.out.println("Enter Product Name = ");
			String name = sc.next();
			
			System.out.print("Enter Product Price = ");
			Double price = sc.nextDouble();
			
			pq.offer(new Product(id, name, price));
			
			System.out.println("Want to continue y/n");
			input = sc.next();
		}
		
		System.out.println("Here is result ==================");
		
		Iterator<Product> itr = pq.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
