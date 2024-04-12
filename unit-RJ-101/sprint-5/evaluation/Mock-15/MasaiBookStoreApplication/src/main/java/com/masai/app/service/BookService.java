package com.masai.app.service;

import com.masai.app.exception.BookNotFoundException;
import com.masai.app.model.Book;

public interface BookService {

	public Book registerBook(Book book) throws BookNotFoundException;
	
}
