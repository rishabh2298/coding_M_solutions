package com.masai.dao;

import com.masai.exception.BookException;
import com.masai.model.Book;

public interface BookDao {
	
	public Book getBookById(int bookId) throws BookException;
	
	public String createBook(Book book) throws BookException;
	
	public Book deleteBookById(int bookId) throws BookException;
	
	public String updateBookPrice(int bookId) throws BookException;

}
