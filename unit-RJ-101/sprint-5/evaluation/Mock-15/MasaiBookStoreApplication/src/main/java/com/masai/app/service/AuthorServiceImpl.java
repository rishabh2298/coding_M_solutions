package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.AuthorNotFoundException;
import com.masai.app.model.Author;
import com.masai.app.model.Book;
import com.masai.app.model.Cart;
import com.masai.app.repository.AuthorRepository;
import com.masai.app.repository.BookRespository;
import com.masai.app.repository.CartRepository;

public class AuthorServiceImpl implements AuthorService {

	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private BookRespository bookRespository;
	
	@Autowired
	private CartRepository cartRepository;
	
	
	
	
	
	@Override
	public Author maxSaleBookAuthor() throws AuthorNotFoundException {
		
		List<Book> books = bookRespository.findAll();
		
		List<Cart> carts = cartRepository.findAll();
		
		int ans = 0;
		Author result = null;
		
		for(Book book : books) {
			int count = 0;
			for(Cart cart : carts) {
				if(cart.getBooks().contains(book)) {
					count++;
				}
			}
			if(count>ans) {
				ans = count;
				result = book.getAuthor();
			}
		}
		
		if(result==null) throw new AuthorNotFoundException("There is no such author exist....");
		
		return result;
	}
	

	@Override
	public Author deleteAuthor(Integer authorId) throws AuthorNotFoundException {
		
		Author author = authorRepository.findById(authorId).orElseThrow(() -> new AuthorNotFoundException("No such author exist with this author id"));
		
		return author;
	}

}
