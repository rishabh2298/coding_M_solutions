package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.CabUser;
import com.masai.app.repository.CabUserRepository;

@RestController
public class LoginController {

	
	@Autowired
	private CabUserRepository cabUserRepository;
	
	
	
	
	
	@GetMapping("/masaicab/user/login")
	public ResponseEntity<CabUser> loggedInUserDetailsHandler(Authentication authentication){
		
		CabUser cabUser = cabUserRepository.findById(authentication.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		 
		return new ResponseEntity<>(cabUser, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/masaicab/user/logout")
	public ResponseEntity<CabUser> loggedOutUserDetailsHandler(Authentication authentication){
		
		CabUser cabUser = cabUserRepository.findById(authentication.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		 
		return new ResponseEntity<>(cabUser, HttpStatus.OK);
		
	}
	
	
}
