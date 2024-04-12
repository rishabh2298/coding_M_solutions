package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.ShipmentDao;
import com.masai.dao.ShipmentDaoImpl;
import com.masai.exception.ShipmentException;
import com.masai.model.Shipment;

public class CreateNewShipment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter package name");
		String packageName = scanner.nextLine();
		
		System.out.println("Enter content");
		String content = scanner.nextLine();
		
		System.out.println("Enter Weight");
		double weight = scanner.nextDouble();
		
		scanner.nextLine();
		System.out.println("Enter Sender address");
		String senderAddres = scanner.nextLine();
		
		System.out.println("Enter recipient address");
		String recipientAddress = scanner.nextLine();
		
		
		
		Shipment shipment = new Shipment(packageName, content, weight, senderAddres, recipientAddress);
		
		
		ShipmentDao dao = new ShipmentDaoImpl();
		
		try {
			System.out.println(dao.createNewShipment(shipment));
			
		} catch (ShipmentException e) {

			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
