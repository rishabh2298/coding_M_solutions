package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Truck;
import com.masai.app.service.TruckService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class TruckController {

	@Autowired
	private TruckService truckService;
	
	
	
	
	
	
	@GetMapping("/masaiTruck/user/vehicle/{vehicleId}")
	public ResponseEntity<Truck> getTruckDetailsHandler(@PathVariable("vehicleId") String vehicleId){
		
		Truck result = truckService.getVehicle(vehicleId);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	
	
	@PutMapping("/masaiTruck/user/{vehicleId}")
	public ResponseEntity<Truck> updateTruck(@PathVariable("vehicleId") String truckId, @Valid @RequestBody Truck truck){
		
		Truck result = truckService.updateVehicle(truckId, truck);
		
		return new ResponseEntity<Truck>(result, HttpStatus.OK);
		
	}
	
	
	
	
	
	@DeleteMapping("/masaiTruck/user/{vehicleId}")
	public ResponseEntity<Truck> deleteTruck(@PathVariable("vehicleId") String truckId){
		
		Truck result = truckService.deleteTruck(truckId);
		
		return new ResponseEntity<Truck>(result, HttpStatus.OK);
		
	}
	
	
	
	
}
