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
	
	
	
	
	@PostMapping("/masaiEcommerce/login")
	public ResponseEntity<User> loggedInUserDetailsHandler(Authentication authentication){
		
		User user = userRepository.findByEmail(authentication.getName());
		
		if(user == null) throw new BadCredentialsException("Invalid Username or password");
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/masaiEcommerce/logout")
	public ResponseEntity<User> loggedOutUserDetailsHandler(Authentication authentication){
		
		User user = userRepository.findByEmail(authentication.getName());
		
		if(user == null) throw new BadCredentialsException("Invalid Username or password");
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	
}
