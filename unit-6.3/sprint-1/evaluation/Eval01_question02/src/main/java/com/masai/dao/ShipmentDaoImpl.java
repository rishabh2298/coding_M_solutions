package com.masai.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;

import com.masai.exception.ShipmentException;
import com.masai.model.Shipment;
import com.masai.util.EMUtil;

public class ShipmentDaoImpl implements ShipmentDao {

	@Override
	public Shipment getInformationByShipmentId(int shipmentId) throws ShipmentException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Shipment shipment = em.find(Shipment.class, shipmentId);
		
		if(shipment==null) throw new ShipmentException("This shipment does not exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return shipment;
	}
	

	@Override
	public Shipment createNewShipment(Shipment shipment) throws ShipmentException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		shipment.setCreatedTimeStamp(LocalDateTime.now());
		
		em.persist(shipment);
		
		em.getTransaction().commit();
		
		em.close();
		
		return shipment;
	}

	@Override
	public Shipment deleteShipmentById(int shipmentId) throws ShipmentException {


		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Shipment shipment = em.find(Shipment.class, shipmentId);
		
		if(shipment==null) throw new ShipmentException("This shipment doesn't exist....");
		
		em.remove(shipment);
		
		em.getTransaction().commit();
		
		em.close();
		
		return shipment;
	}

	@Override
	public Shipment updateShipmentById(int shipmentId, Shipment shipment) throws ShipmentException {


		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Shipment existShipment = em.find(Shipment.class, shipmentId);
		
		if(existShipment==null) throw new ShipmentException("This shipment with id doesn't exist....");
		
		Shipment updatedShipment = em.merge(shipment);
		
		em.getTransaction().commit();
		
		em.close();
		
		return updatedShipment;
	}

}
