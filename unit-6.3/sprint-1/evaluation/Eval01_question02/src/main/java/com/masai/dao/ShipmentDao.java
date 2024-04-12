package com.masai.dao;

import com.masai.exception.ShipmentException;
import com.masai.model.Shipment;

public interface ShipmentDao {
	
	public Shipment getInformationByShipmentId(int shipmentId) throws ShipmentException;
	
	public Shipment createNewShipment(Shipment shipment) throws ShipmentException;
	
	public Shipment deleteShipmentById(int shipmentId) throws ShipmentException;
	
	public Shipment updateShipmentById(int shipmentId, Shipment shipment) throws ShipmentException;
	
	
}
