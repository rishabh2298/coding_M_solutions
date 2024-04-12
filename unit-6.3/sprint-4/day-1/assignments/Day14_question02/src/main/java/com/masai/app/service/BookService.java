package com.masai.app.service;

import java.util.List;

import com.masai.app.model.Book;

public interface BookService {

	public List<Book> getListOfBooks();
	
	public Book getBookById(Integer bookId);
	
	public Book createNewBook(Book book);
	
	public Book deleteBook(Integer bookId);
	
	public Book updateBook(Integer id, Book book);
	
}
