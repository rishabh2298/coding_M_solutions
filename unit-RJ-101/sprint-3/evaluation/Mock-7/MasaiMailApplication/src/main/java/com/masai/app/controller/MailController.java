package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Mail;
import com.masai.app.service.MailService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class MailController {

	
	@Autowired
	private MailService mailService;
	
	
	
	
	

	@PostMapping("/masaimail/mail")
	public ResponseEntity<Mail> sendMailHandler(@Valid @RequestBody Mail mail){
		
		Mail result = mailService.sendMail(mail);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}


	
	
	@PostMapping("/masaimail/starred/")
	public ResponseEntity<Mail> starredMailHandler(@Valid @RequestBody Mail mail){
		
		Mail result = mailService.starredMail(mail);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	

	@DeleteMapping("/masaimail/delete/{id}")
	public ResponseEntity<Mail> deleteMailHandler(@PathVariable("id") Integer mailId){
		
		Mail result = mailService.deleteMail(mailId);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}

	
	
}
