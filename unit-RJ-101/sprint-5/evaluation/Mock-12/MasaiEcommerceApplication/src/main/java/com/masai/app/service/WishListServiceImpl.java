package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.exception.WishListNotFoundException;
import com.masai.app.model.Product;
import com.masai.app.model.WishList;
import com.masai.app.repository.ProductRepository;
import com.masai.app.repository.WishListRepository;

@Service
public class WishListServiceImpl implements WishListService {

	@Autowired
	private WishListRepository wishListRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	@Override
	public WishList removeProductFromWishList(Integer productId, Integer wishListId) throws WishListNotFoundException {
		
		WishList wishList = wishListRepository.findById(wishListId).orElseThrow(() -> new WishListNotFoundException("No wishlist created yet..."));
		
		Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Prodcut wiht this Id doesn't exist"));
		
		wishList.getItems().add(product);
		
		return wishListRepository.save(wishList);
	}
	

	
	@Override
	public WishList addProductToWishList(Product product) throws ProductNotFoundException {
		
//		wishListRepository.get
		
		return null;
	}


}
