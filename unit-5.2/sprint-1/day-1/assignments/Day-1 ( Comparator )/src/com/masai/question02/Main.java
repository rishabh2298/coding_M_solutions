package com.masai.question02;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		Set<Employee> ts = new TreeSet<>(new SortById());
		
		ts.add(new Employee(10, "Ajay", "Mumbai", 12000));
		ts.add(new Employee(11, "Ranbir", "Delhi", 12602));
		ts.add(new Employee(13, "Chopra", "Banglore", 15000));
		ts.add(new Employee(14, "Uday", "Haridwar", 22000));
		ts.add(new Employee(15, "Hari", "Hydrabad", 12000));
		ts.add(new Employee(10, "Teja", "Chennai", 10500));

		System.out.println("Press-1 => To sort by Id");
		System.out.println("Press-2 => To sort by Address");
		System.out.println("Press-3 => To sort by Salary");
		System.out.println("Press-0 => To Exit");
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your Choice = ");
		Integer choice = input.nextInt();
		
		while(choice!=0) {
			
			switch (choice) {
			
			case 1: {
				Set<Employee> sortedSet = new TreeSet<>(new SortById());
				sortedSet.addAll(ts);
				System.out.println(sortedSet);
			}
			break;
			
			case 2: {
				Set<Employee> sortedSet = new TreeSet<>(new SortByAddress());
				sortedSet.addAll(ts);
				System.out.println(sortedSet);
			}
			break;
			
			case 3: {
				Set<Employee> sortedSet = new TreeSet<>(new SortBySalary());
				sortedSet.addAll(ts);
				System.out.println(sortedSet);
			}
			break;
			
			default:
				choice = 0;
			}
			
			System.out.println();
			
			if(choice!=0) {
				System.out.print("Enter your choice = ");
				choice = input.nextInt();
			}
		
		}
		
		System.out.println("Thankyou!");
		
		input.close();
		
	}

}
