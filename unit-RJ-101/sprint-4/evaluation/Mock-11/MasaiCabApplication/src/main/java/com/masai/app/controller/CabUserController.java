package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.CabDriver;
import com.masai.app.model.CabUser;
import com.masai.app.repository.CabUserRepository;
import com.masai.app.service.CabUserService;

import jakarta.validation.Valid;

@RestController
public class CabUserController {

	
	@Autowired
	private CabUserService cabUserService;
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	
	
	@PostMapping("/masaicab/user/register")
	public ResponseEntity<CabUser> regiesterCabUserHandler(@Valid @RequestBody CabUser cabUser){
		
		cabUser.setPassword(passwordEncoder.encode(cabUser.getPassword()));
		
		CabUser result = cabUserService.regiesterCabUser(cabUser);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/masaicab/user/findride")
	public ResponseEntity<List<CabDriver>> getDriverWithin5KmHandler(@Valid @RequestBody CabUser cabUser){
		
		List<CabDriver> result = cabUserService.getListOfDriverWithin5KM(cabUser.getCurrentLocation());
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
	
	@PutMapping("/masaicab/user/book/{driverId}/{x}/{y}")
	public ResponseEntity<String> bookRideHandler(@PathVariable("driverId") String driverId, @PathVariable("x") Integer x, @PathVariable("x") Integer y){
		
		String result = cabUserService.bookRide(driverId, x, y);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
	
	
}
