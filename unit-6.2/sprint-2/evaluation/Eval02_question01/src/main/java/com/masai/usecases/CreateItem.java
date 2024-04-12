package com.masai.usecases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.masai.entity.Item;
import com.masai.entity.Order;
import com.masai.services.MethodDao;
import com.masai.services.MethodDaoImpl;

public class CreateItem {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Item Name");
		String name = scanner.next();
		
		System.out.println("Enter No of days to delivery");
		String deliveryDate = scanner.next();
		
		
		Item item = new Item(name, LocalDate.now(), LocalTime.now());
		
		scanner.nextLine();
		System.out.println("Enter delivery address");;
		String address = scanner.nextLine();
		
		System.out.println("Enter total amount");
		double amount = scanner.nextDouble();
		
		Order order = new Order(address, amount, LocalTime.now());
		
		
		item.setOrder(order);

		List<Item> list = new ArrayList<>();
		
		list.add(item);
		
		
		
		
		
		MethodDao dao = new MethodDaoImpl();
		
		dao.createItem(item, order);
		
		
		scanner.close();
	}

}
