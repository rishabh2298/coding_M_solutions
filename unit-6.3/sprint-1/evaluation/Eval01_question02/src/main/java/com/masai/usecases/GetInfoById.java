package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.ShipmentDao;
import com.masai.dao.ShipmentDaoImpl;
import com.masai.exception.ShipmentException;

public class GetInfoById {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter shipment Id");
		int shipmentId = scanner.nextInt();
		
		
		ShipmentDao dao = new ShipmentDaoImpl();
		
		try {
			System.out.println(dao.getInformationByShipmentId(shipmentId));
		
		} catch (ShipmentException e) {

			System.out.println(e.getMessage());
		}
		
		scanner.close();
	}
	
}
