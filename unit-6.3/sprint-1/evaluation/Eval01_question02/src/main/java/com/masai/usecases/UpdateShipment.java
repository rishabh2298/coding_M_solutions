package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.ShipmentDao;
import com.masai.dao.ShipmentDaoImpl;
import com.masai.exception.ShipmentException;
import com.masai.model.Shipment;

public class UpdateShipment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter shipment Id to update");
		int shipmentId = scanner.nextInt();
		
		System.out.println("Enter Shipment Content");
		String content = scanner.nextLine();
		
		System.out.println("Enter Shipment Recipeint Address");
		String recipeintAddress = scanner.nextLine();
		
		System.out.println("Enter Shipment Weight");
		double weight = scanner.nextDouble();
		
		
		
		Shipment shipment = new Shipment();
		
		shipment.setContent(content);
		shipment.setRecipientAddress(recipeintAddress);
		shipment.setWeight(weight);
		
		
		
		ShipmentDao dao = new ShipmentDaoImpl();
		
		try {
			System.out.println(dao.updateShipmentById(shipmentId, shipment));
			
		} catch (ShipmentException e) {

			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
