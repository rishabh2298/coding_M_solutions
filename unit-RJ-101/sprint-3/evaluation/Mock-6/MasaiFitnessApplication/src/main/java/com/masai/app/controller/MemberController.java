package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.LogIn;
import com.masai.app.model.Member;
import com.masai.app.model.Trainer;
import com.masai.app.service.MemberService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;

@RestController
public class MemberController {
	
	
	@Autowired
	private MemberService memberService;
	
	
	
	
	
	
	
	@PostMapping("/masaifitness/register")
	public ResponseEntity<Member> registerNewMemberHandler(@Valid @RequestBody Member member){
		
		Member result = memberService.registerNewMember(member);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
		
	}
	
	
	

	@PostMapping("/masaifitness/login")
	public ResponseEntity<String> logInMemberHandler(@Valid @RequestBody LogIn logInDTO){
		
		String result = memberService.logInMember(logInDTO);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	

	@PostMapping("/masaifitness/logout/{key}")
	public ResponseEntity<String> logOutMemberHandler(@Valid @RequestBody LogIn logInDTO, String key){
		
		String result = memberService.logOutMember(logInDTO,key);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	@GetMapping("/masaifitness/trainers/availabe/{memberId}/{logInKey}")
	public ResponseEntity<List<Trainer>> getListOfTrainerForLogInMember(@PathVariable("memberId") Integer memberId, @PathVariable("logInKey") String memberKey){
		
		List<Trainer> list = memberService.getTrainerList(memberId, memberKey);
		
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
	
	@PutMapping("/masaifitness/user/trainer/{userKey}")
	public ResponseEntity<String> allotTrainerToUser(@PathVariable("userKey") String userKey, @Valid @RequestBody Trainer trainer){
		
		String result = memberService.allotTrainerToUser(trainer, userKey);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	

}
