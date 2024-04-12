package com.masai.dao;

import java.util.List;

import com.masai.exception.ProductException;
import com.model.Product;

public interface ProductDao {

	public String addProduct(Product product) throws ProductException;
	
	public List<Product> getAllProducts() throws ProductException;
	
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException;
	
	public String addProductQuantity(int productId, int quantity) throws ProductException;
	
	public String deleteProductByProductName(String pname) throws ProductException;
	
	public Product getProductByProductName(String pname) throws ProductException;
	
}
