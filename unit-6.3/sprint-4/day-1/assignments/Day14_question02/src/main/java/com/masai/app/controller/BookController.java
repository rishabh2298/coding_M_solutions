package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Book;
import com.masai.app.service.BookService;

@RestController
@RequestMapping("/bookservice")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping(value = "/books", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Book>> getBookListHandler(){
		
		List<Book> bookList = bookService.getListOfBooks();
		
		return new ResponseEntity<>(bookList,HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/books/{id}")
	public ResponseEntity<Book> getBookByIdHandler(@PathVariable("id") Integer id){
		
		Book book = bookService.getBookById(id);
		
		return new ResponseEntity<>(book,HttpStatus.OK);
		
	}
	
	
	
	@PostMapping(value = "/books")
	public ResponseEntity<Book> createBookHandler(@RequestBody Book book){
		
		Book savedBook = bookService.createNewBook(book);

		return new ResponseEntity<>(savedBook, HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping(value = "/books/{id}")
	public ResponseEntity<Book> deleteBookHandler(@PathVariable("id") Integer bookId){
		
		Book book = bookService.deleteBook(bookId);
		
		return new ResponseEntity<Book>(book, HttpStatus.OK);
	}
	
	
	
	@PutMapping(value = "/books/{id}")
	public ResponseEntity<Book> updateBookHandler(@PathVariable("id") Integer id, @RequestBody Book book){
		
		Book updatedBook = bookService.updateBook(id, book);
		
		return new ResponseEntity<>(updatedBook, HttpStatus.OK);
	}
	
	
	
}
