package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.ShipmentDao;
import com.masai.dao.ShipmentDaoImpl;
import com.masai.exception.ShipmentException;

public class DeleteShipmentById {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter shipment Id to delete");
		int shipmentId = scanner.nextInt();
		
		
		ShipmentDao dao = new ShipmentDaoImpl();
		
		try {
			System.out.println(dao.deleteShipmentById(shipmentId));
			
		} catch (ShipmentException e) {

			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
