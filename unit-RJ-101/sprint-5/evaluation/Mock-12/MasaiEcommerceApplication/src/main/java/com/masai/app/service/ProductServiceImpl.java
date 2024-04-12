package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.ProductNotFoundException;
import com.masai.app.model.Product;
import com.masai.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	
	
	@Override
	public List<Product> getListOfAllProducts() throws ProductNotFoundException {
		
		List<Product> products = productRepository.findAll();
		
		if(products.isEmpty()) throw new ProductNotFoundException("There is no product in the data exist yet...");
		
		return products;
	}

	@Override
	public Product getProductById(Integer productId) throws ProductNotFoundException {
		
		Product product = productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("No product exist with this id...."));
		
		return product;
	}

}
