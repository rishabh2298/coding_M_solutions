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
	
	
	
	
	@PostMapping("/masaibook/register")
	public ResponseEntity<User> userRegisterHandler(@Valid @RequestBody User user){
		
		User result = userService.registerUser(user);
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	
}
