package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.model.Book;
import com.masai.app.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	
	@Autowired
	private BookRepository bookRepository;
	
	
	
	@Override
	public List<Book> getListOfBooks() {
		
		List<Book> books = bookRepository.getAllBooks();
		
		if(books.isEmpty()) {
			System.out.println("Book list is empty");
			return null;
		}
		
		return books;
	}
	

	@Override
	public Book getBookById(Integer bookId) {

		return bookRepository.findById(bookId).orElseThrow(() -> new IllegalArgumentException("No such Book exist with this Id"));
	}

	
	@Override
	public Book createNewBook(Book book) {

		Book savedBook = bookRepository.save(book);
		
		return savedBook;
	}

	
	@Override
	public Book deleteBook(Integer bookId) {
		
		Book existBook = bookRepository.findById(bookId).orElseThrow(() -> new IllegalArgumentException("No such Book exist with this Id"));
		
		bookRepository.delete(existBook);
		
		return existBook;
	}


	@Override
	public Book updateBook(Integer id, Book book) {

		Book existBook = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No such Book exist with this id.."));
		
		return bookRepository.save(book);
		
	}

}
