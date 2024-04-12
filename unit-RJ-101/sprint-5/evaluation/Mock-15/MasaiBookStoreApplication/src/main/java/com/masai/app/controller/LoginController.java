package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.User;
import com.masai.app.repository.UserRepository;

@RestController
public class LoginController {

	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	@PostMapping("/masaibook/user/login")
	public ResponseEntity<User> loggedInUserHandler(Authentication authentication){
		
		User user = userRepository.findByMobileNumber(authentication.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		 
		return new ResponseEntity<>(user, HttpStatus.OK);	
	}

	
	
	@PostMapping("/masaibook/user/logout")
	public ResponseEntity<User> loggedOutUserHandler(Authentication authentication){
		
		User user = userRepository.findByMobileNumber(authentication.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		 
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	
}
