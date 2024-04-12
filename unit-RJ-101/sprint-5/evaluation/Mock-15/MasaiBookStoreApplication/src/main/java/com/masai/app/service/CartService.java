package com.masai.app.service;

import com.masai.app.exception.BookNotFoundException;
import com.masai.app.exception.CartNotFoundException;
import com.masai.app.model.Cart;

public interface CartService {

	public Cart addBookToCart(Integer bookId, Cart cart) throws CartNotFoundException,BookNotFoundException;
	
	public Cart purchaseBook(Cart cart) throws CartNotFoundException;
	
	public Cart refreshCartToRemoveOldBooks(Cart cart) throws CartNotFoundException;
	
}
