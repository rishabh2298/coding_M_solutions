package com.masai.app.service;

import com.masai.app.exception.CartNotFoundException;
import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.model.Cart;
import com.masai.app.model.Product;

public interface CartService {

	public Cart addProductToCart(Integer cartId,Product product) throws CartNotFoundException,ProductNotFoundException;
	
}
