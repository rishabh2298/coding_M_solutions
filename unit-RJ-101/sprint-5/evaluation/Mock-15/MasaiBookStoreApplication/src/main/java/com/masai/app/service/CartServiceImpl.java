package com.masai.app.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.BookNotFoundException;
import com.masai.app.exception.CartNotFoundException;
import com.masai.app.model.Book;
import com.masai.app.model.Cart;
import com.masai.app.model.User;
import com.masai.app.repository.BookRespository;
import com.masai.app.repository.CartRepository;
import com.masai.app.repository.UserRepository;

public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepository cartRepository;
	
	
	@Autowired
	private BookRespository bookRespository;
	
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	
	@Override
	public Cart addBookToCart(Integer bookId, Cart cart) throws CartNotFoundException, BookNotFoundException {
		
		Book book = bookRespository.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book with this id does not exist...."));
		
		cartRepository.findById(cart.getCartId()).orElseThrow(() -> new CartNotFoundException("This cart does not exist yet...."));
		
		cart.getBooks().add(book);
		
		return cartRepository.save(cart);
	}

	@Override
	public Cart purchaseBook(Cart cart) throws CartNotFoundException {

		cartRepository.findById(cart.getCartId()).orElseThrow(() -> new CartNotFoundException("This cart does not exist yet...."));

		User user = userRepository.findByCart(cart.getCartId());
		
		Integer amount = user.getBudget();
		
		Set<Book> books = cart.getBooks();

		for(Book book : books) {
			
			if(amount >= book.getPrice()) {
				
				amount -= book.getPrice();

				books.remove(book);
			}
		}
		
		cart.getBooks().retainAll(books);
		
		return cartRepository.save(cart);
	}
	

	@Override
	public Cart refreshCartToRemoveOldBooks(Cart cart) throws CartNotFoundException {

		cartRepository.findById(cart.getCartId()).orElseThrow(() -> new CartNotFoundException("This cart does not exist yet...."));

		for(Book book : cart.getBooks()){
			
//			if()
			
		}
		
		return null;
	}

}
