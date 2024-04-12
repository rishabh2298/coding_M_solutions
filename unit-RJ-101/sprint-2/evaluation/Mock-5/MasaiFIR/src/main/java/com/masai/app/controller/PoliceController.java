package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.LogIn;
import com.masai.app.model.Police;
import com.masai.app.service.PoliceService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class PoliceController {

	
	@Autowired
	private PoliceService policeService;
	
	
	

	
	
	@PostMapping("/masaifir/user/register")
	public ResponseEntity<Police> registerPoliceHandler(@Valid @RequestBody Police police){
		
		Police savedPolice = policeService.registerPolice(police);
		
		return new ResponseEntity<>(savedPolice, HttpStatus.CREATED);
		
	}
	
	
	
	@PostMapping("/masaifir/user/login")
	public ResponseEntity<String> logInPoliceHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = policeService.logInPolice(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
}
