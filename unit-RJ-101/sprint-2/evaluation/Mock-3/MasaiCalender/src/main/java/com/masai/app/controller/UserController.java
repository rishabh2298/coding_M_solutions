package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Event;
import com.masai.app.model.LogIn;
import com.masai.app.model.User;
import com.masai.app.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	
	
	
	
	
	@PostMapping("/masaicalender/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		User addedUser = userService.registerUser(user);
		
		return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
		
	}

	
	

	@PostMapping("/masaicalender/login")
	public ResponseEntity<String> logInUserHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = userService.logInUser(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/masaicalender/event/{type}")
	public ResponseEntity<List<Event>> getEventDetailsHandler(@PathVariable("type") String eventType){
		
		List<Event> events = userService.getEventDetails(eventType);
		
		return new ResponseEntity<>(events, HttpStatus.OK);
		
	}
	
	
	
	
	@PutMapping("/masaicalender")
	public ResponseEntity<User> updateUserDetailsHandler(@Valid @RequestBody User user){
		
		User updatedUser = userService.updateUserDetails(user);
		
		return new ResponseEntity<>(updatedUser,HttpStatus.OK);
	}
	
	
	
	
	
	
	
}

