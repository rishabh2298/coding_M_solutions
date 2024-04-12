package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.CabDriver;
import com.masai.app.service.CabDriverService;

import jakarta.validation.Valid;

@RestController
public class CabDriverController {

	
	@Autowired
	private CabDriverService cabDriverService;

	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	
	
	
	@PostMapping("/masaicab/driver/register")
	public ResponseEntity<CabDriver> registerCabDriverHandler(@Valid @RequestBody CabDriver cabDriver){
		
		cabDriver.setPassword(passwordEncoder.encode(cabDriver.getPassword()));
		
		CabDriver result = cabDriverService.registerCabDriver(cabDriver);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	
}
