package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.CartNotFoundException;
import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.model.Cart;
import com.masai.app.model.Product;
import com.masai.app.repository.CartRepository;
import com.masai.app.repository.ProductRepository;

@Service
public class CartServiceImpl implements CartService {

	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	@Override
	public Cart addProductToCart(Integer cartId, Product product) throws CartNotFoundException,ProductNotFoundException {
		
		Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartNotFoundException("This cart doesnt have any user...."));
		
		productRepository.findById(product.getProductId()).orElseThrow(() -> new ProductNotFoundException("No such product available..."));
		
		cart.getItems().add(product);
				
		return cartRepository.save(cart);
	}

}
