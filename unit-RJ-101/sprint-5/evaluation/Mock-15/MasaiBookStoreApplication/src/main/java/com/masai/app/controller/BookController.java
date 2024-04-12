package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Book;
import com.masai.app.service.BookService;

import jakarta.validation.Valid;

@RestController
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	
	
	


	@PostMapping("/masaibook/register")
	public ResponseEntity<Book> registerBookHandler(@Valid @RequestBody Book book){
		
		Book result = bookService.registerBook(book);
		
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}
	
	
}
