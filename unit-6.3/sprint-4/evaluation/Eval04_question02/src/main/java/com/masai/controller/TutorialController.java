package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Comment;
import com.masai.model.Tutorial;
import com.masai.service.TutorialService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class TutorialController {
	
	
	@Autowired
	private TutorialService tutorialService;

	
	
	
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> addTutorialHandler(@Valid @RequestBody Tutorial tutorial){
		
		Tutorial result = tutorialService.addTutorial(tutorial);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	
	

	@PostMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> addCommentToTutorialHandler(@PathVariable("id") Long tutorialId , @Valid @RequestBody Comment comment){
		
		Tutorial result = tutorialService.addComments(tutorialId, comment);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	
	
	

	@GetMapping("/tutorials/{id}")
	public ResponseEntity<List<Comment>> getAllCommentsOfTutorialHandler(@PathVariable("id") Long tutorialId){
		
		List<Comment> result = tutorialService.getAllCommentsOfTutorial(tutorialId);
		
		return new ResponseEntity<>(result, HttpStatus.FOUND);
	}
	
	
	

	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> deleteTutorialAndCommentsHandler(@PathVariable("id") Long tutorialId){
		
		Tutorial result = tutorialService.deleteTutorialAndCommentsById(tutorialId);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	

	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> deleteAllCommentsOfTutorialHandler(@PathVariable("id") Long tutorialId){
		
		Tutorial result = tutorialService.deleteAllCommentsOfTutorial(tutorialId);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	
	
}
