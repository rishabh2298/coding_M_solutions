package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.User;
import com.masai.app.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	

	
	@PostMapping("/masaiTruck/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		user.setRole("ROLE_"+user.getRole().toUpperCase());
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		User saveUser = userService.registerNewUser(user);
		
		return new ResponseEntity<>(saveUser,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	@GetMapping("/masaiTruck/welcome")
	public ResponseEntity<String> welcomeMessageHandler(){
		
		return new ResponseEntity<>("Welcome to Masai Truck Application......" ,HttpStatus.OK);
	}
	
	
}
