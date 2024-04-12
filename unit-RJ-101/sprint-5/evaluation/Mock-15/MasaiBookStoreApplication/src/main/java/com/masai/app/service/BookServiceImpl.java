package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.BookNotFoundException;
import com.masai.app.model.Book;
import com.masai.app.repository.BookRespository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRespository bookRespository;
	
	
	
	

	@Override
	public Book registerBook(Book book) throws BookNotFoundException {
		
		Optional<Book> optional = bookRespository.findById(book.getBookId());
		
		if(optional.isPresent()) throw new BookNotFoundException("This book already existed");
		
		return bookRespository.save(book);
	}

}
