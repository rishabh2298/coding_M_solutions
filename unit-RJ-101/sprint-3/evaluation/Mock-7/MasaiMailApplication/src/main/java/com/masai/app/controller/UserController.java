package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.LogIn;
import com.masai.app.model.Mail;
import com.masai.app.model.User;
import com.masai.app.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	
	
	@PostMapping("/masaimail/register")
	public ResponseEntity<User> registerUserHandler(@Valid @RequestBody User user){
		
		User result = userService.registerNewUser(user);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
		
	}
	
	
	

	@PostMapping("/masaimail/login")
	public ResponseEntity<String> logInUserHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = userService.logInUser(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	

	@GetMapping("/masaimail/mail/{userId}")
	public ResponseEntity<List<Mail>> getAllMailsHandler(@PathVariable("userId") String userId){
		
		List<Mail> result = userService.getAllMailsOfUser(userId);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	

	@GetMapping("/masaimail/starred/{userId}")
	public ResponseEntity<List<Mail>> getAllStarredMailsHandler(@PathVariable("userId") String userId){
		
		List<Mail> result = userService.getAllStarredMails(userId);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	

	@PostMapping("/masaimail/user")
	public ResponseEntity<User> updateUserHandler(@Valid @RequestBody User user){
		
		User result = userService.updateUser(user);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
}
