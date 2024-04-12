package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.TruckNotFoundException;
import com.masai.app.model.Truck;
import com.masai.app.repository.TruckRepository;

@Service
public class TruckServiceImpl implements TruckService {
	
	
	@Autowired
	private TruckRepository truckRepository;
	
	
	
	
	
	
	

	@Override
	public Truck getVehicle(String vehicleId) throws TruckNotFoundException {

		Truck truck = truckRepository.findById(vehicleId).orElseThrow(() -> new TruckNotFoundException("There is no truck registerd yet...."));
		
		return truck;
	}

	
	@Override
	public Truck updateVehicle(String truckId, Truck truck) throws TruckNotFoundException {
		
		Truck existedTruck = truckRepository.findById(truckId).orElseThrow(() -> new TruckNotFoundException("There is no truck registerd yet...."));
		
		return truckRepository.save(truck);
	}
	
	

	@Override
	public Truck deleteTruck(String vehicleId) throws TruckNotFoundException {
		
		Truck truck = truckRepository.findById(vehicleId).orElseThrow(() -> new TruckNotFoundException("There is no truck registerd yet...."));

		truckRepository.delete(truck);

		return truck;
	}

}
