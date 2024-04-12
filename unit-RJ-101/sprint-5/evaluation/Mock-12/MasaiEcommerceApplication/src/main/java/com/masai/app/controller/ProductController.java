package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Product;
import com.masai.app.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	
	
	
	
	
	
	@GetMapping("/masaiEcommerce/products")
	public ResponseEntity<List<Product>> getAllProductsHandlers(){
		
		List<Product> products = productService.getListOfAllProducts();
		
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/masaiEcommerce/products/{id}")
	public ResponseEntity<Product> getProductByIdHandler(@PathVariable("id") Integer productId){
		
		Product product = productService.getProductById(productId);
		
		return new ResponseEntity<>(product, HttpStatus.OK);
	}
	
	
	
}
