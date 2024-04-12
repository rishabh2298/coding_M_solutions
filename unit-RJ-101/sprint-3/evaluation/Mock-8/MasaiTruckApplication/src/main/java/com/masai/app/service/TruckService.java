package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.TruckNotFoundException;
import com.masai.app.model.Truck;

public interface TruckService {

	public Truck getVehicle(String vehicleId) throws TruckNotFoundException;
	
	public Truck updateVehicle(String truckId , Truck truck) throws TruckNotFoundException;
	
	public Truck deleteTruck(String vehicleId) throws TruckNotFoundException;
	
}
