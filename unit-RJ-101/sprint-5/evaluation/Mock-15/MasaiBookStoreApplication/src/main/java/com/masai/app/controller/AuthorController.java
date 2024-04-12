package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Author;
import com.masai.app.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	
	
	
	
	@GetMapping("/masaibook/author")
	public ResponseEntity<Author> mostPopularAuthorHandler(){
		
		Author author = authorService.maxSaleBookAuthor();
		
		return new ResponseEntity<>(author, HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/masaibook/author/{authorId}")
	public ResponseEntity<Author> deleteAuthor(@PathVariable("authorId") Integer authorId){
		
		Author author = authorService.deleteAuthor(authorId);
		
		return new ResponseEntity<>(author, HttpStatus.OK);
		
	}
	
}
