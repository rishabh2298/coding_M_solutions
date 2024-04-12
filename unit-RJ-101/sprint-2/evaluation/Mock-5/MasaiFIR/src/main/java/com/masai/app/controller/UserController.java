package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.FIR;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;
import com.masai.app.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/masaifir/user/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		User savedUser = userService.registerUser(user);
		
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
		
	}
	
	
	
	@PostMapping("/masaifir/user/login")
	public ResponseEntity<String> logInUserHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = userService.logInUser(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	@PostMapping("/masaifir/user/fir")
	public ResponseEntity<FIR> createFirHandler(@Valid @RequestBody FIR fir){
		
		FIR createdFir = userService.createFIR(fir);
		
		return new ResponseEntity<>(createdFir, HttpStatus.CREATED);
		
	}
	
	
}
