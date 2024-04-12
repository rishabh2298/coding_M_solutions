package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Comment;
import com.masai.service.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class CommentController {

	
	@Autowired
	private CommentService commetService;
	
	
	
	
	

	@GetMapping("/comments/{id}")
	public ResponseEntity<Comment> getCommentByIdHandler(@PathVariable("id") Long commentId){
		
		Comment result = commetService.getCommentById(commentId);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	

	

	@PutMapping("/comments/{id}")
	public ResponseEntity<Comment> updateCommentHandler(@PathVariable("id") Long commentId, @Valid @RequestBody Comment comment){
		
		Comment result = commetService.updateComment(commentId, comment);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	
	

	@DeleteMapping("/comments/{id}")
	public ResponseEntity<Comment> deleteCommentByIdHandler(@PathVariable("id") Long commentId){
		
		Comment result = commetService.deleteCommentById(commentId);
		
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	
}
