package com.masai.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("travel")
@Scope("prototype")
public class Travel {
	
	@Autowired
	private Vehicle vehicle;

	@PostConstruct
	public void initMethod() {
		System.out.println("Initializing logic (init-method)");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Logic to clear resorces from spring beans (destroy method)");
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
