package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.User;
import com.masai.app.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	
	
	
	@PostMapping("/masaiEcommerce/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		User savedUser = userService.registerUser(user);
		
		return  new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	
	
	
}
