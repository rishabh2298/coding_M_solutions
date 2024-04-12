package com.masai.app.service;

import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.exception.WishListNotFoundException;
import com.masai.app.model.Product;
import com.masai.app.model.WishList;

public interface WishListService {

	public WishList addProductToWishList(Product product) throws ProductNotFoundException;
	
	public WishList removeProductFromWishList(Integer productId, Integer wishListId) throws WishListNotFoundException;
	
}
