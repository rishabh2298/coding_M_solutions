package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.model.Product;

public interface ProductService {

	public List<Product> getListOfAllProducts() throws ProductNotFoundException;
	
	public Product getProductById(Integer productId) throws ProductNotFoundException;
	
}
