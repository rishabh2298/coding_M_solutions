package com.masai.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.exception.MyErrorDetails;
import com.masai.app.model.Product;
import com.masai.app.model.ProductDTO;
import com.masai.app.service.ProductService;

@RestController
public class MyController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> getListOfProductsHandler(){
		
		List<ProductDTO> products = productService.getAllProducts();
		
		return new ResponseEntity<List<ProductDTO>>(products, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDTO> getProductByIdHandler(@PathVariable("id") Integer id){
		
		ProductDTO dto = productService.getProductById(id);
		
		return new ResponseEntity<ProductDTO>(dto, HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("/products")
	public ResponseEntity<String> saveProductHandler(@Valid @RequestBody Product product){
		
		String message = productService.createProduct(product);
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
		
	}
	
	
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProductByIdHandler(@PathVariable Integer id){
		
		Product product = productService.deleteProductById(id);

		return new ResponseEntity<Product>(product, HttpStatus.ACCEPTED);
		
	}
	

}








