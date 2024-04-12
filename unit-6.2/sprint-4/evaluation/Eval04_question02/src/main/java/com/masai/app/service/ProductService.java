package com.masai.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.exception.ProductException;
import com.masai.app.model.Product;
import com.masai.app.model.ProductDTO;

@Service
public interface ProductService {
	
	public List<ProductDTO> getAllProducts() throws ProductException;
	
	public ProductDTO getProductById(Integer id) throws ProductException;
	
	public String createProduct(Product product) throws ProductException;
	
	public Product deleteProductById(Integer id) throws ProductException;
	
	public Product updateProduct(Product product) throws ProductException;

}
