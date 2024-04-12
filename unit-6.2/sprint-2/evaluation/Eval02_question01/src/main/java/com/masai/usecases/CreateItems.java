package com.masai.usecases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.masai.entity.Item;
import com.masai.entity.Order;

public class CreateItems {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		scanner.nextLine();
		System.out.println("Enter Order delivery address");
		String address = scanner.nextLine();
		
		System.out.println("Enter total amount");
		double amount = scanner.nextDouble();
		
		Order order = new Order(address, amount, LocalTime.now());

		List<Item> list = new ArrayList<>();
		
		String choice = "Yes";
		while(choice.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter Item Name");
			String name = scanner.next();
			
			System.out.println("Enter No of days to delivery");
			String deliveryDate = scanner.next();
			
			
			Item item = new Item(name, LocalDate.now(), LocalTime.now());
			
			System.out.println("If continue adding item enter => YES");
			choice = scanner.next();
		}
		
		
		scanner.close();
		
	}
	
}
