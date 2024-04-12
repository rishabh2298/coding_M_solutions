package com.masai.dao;

import com.masai.entity.Product;

public interface DaoMethod {
	
	public abstract String addProduct(Product product);
	
	public abstract Product getProductById(int id);

}
