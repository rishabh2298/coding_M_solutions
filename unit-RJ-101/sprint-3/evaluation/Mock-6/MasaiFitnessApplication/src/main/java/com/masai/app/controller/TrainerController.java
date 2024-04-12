package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.LogIn;
import com.masai.app.model.Trainer;
import com.masai.app.service.TrainerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class TrainerController {

	
	@Autowired
	private TrainerService trainerService;
	
	
	
	
	
	
	
	@PostMapping("/masaifitness/register")
	public ResponseEntity<Trainer> registerNewTrainer(@Valid @RequestBody Trainer trainer){
		
		Trainer result = trainerService.registerNewTrainer(trainer);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
		
	}
	

	@PostMapping("/masaifitness/login")
	public ResponseEntity<String> logInTrainerHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = trainerService.logInTrainer(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	

	@PostMapping("/masaifitness/logout/{key}")
	public ResponseEntity<String> logOutTrainerHandler(@Valid @RequestBody LogIn logInDTO, String key){
		
		String result = trainerService.logOutTrainer(logInDTO,key);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/masaifitness/trainer")
	public ResponseEntity<Trainer> maxSalaryTrainerHandler(){
		
		Trainer trainer = trainerService.maxSalaryTrainer();
		
		return new ResponseEntity<>(trainer,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
}
