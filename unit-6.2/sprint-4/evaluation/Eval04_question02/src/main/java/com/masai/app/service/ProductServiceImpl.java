package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.ProductException;
import com.masai.app.model.Product;
import com.masai.app.model.ProductDTO;
import com.masai.app.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
	@Override
	public List<ProductDTO> getAllProducts() throws ProductException {
		
		List<Product> products = productRepository.findAll();
		
		if(products.isEmpty()) throw new ProductException("There is no products in Database....");
		
		List<ProductDTO> productDTOs = new ArrayList<>();
		
		products.forEach((product) -> {
			
			ProductDTO dto = new ProductDTO();
			
			dto.setName(product.getName());
			dto.setBrand(product.getBrand());
			dto.setCategory(product.getCategory());
			dto.setPrice(product.getPrice());
			
			productDTOs.add(dto);
		});
		
		return productDTOs;
	}
	
	

	@Override
	public ProductDTO getProductById(Integer id) throws ProductException {
		
		Optional<Product> optional = productRepository.findById(id);
		
		if(optional.isPresent()) {
			
			Product product = optional.get();
			
			ProductDTO dto = new ProductDTO();
			
			dto.setName(product.getName());
			dto.setBrand(product.getBrand());
			dto.setCategory(product.getCategory());
			dto.setPrice(product.getPrice());
			
			return dto;
			
		}
		else {
			throw new ProductException("No such Student found with Id = "+id);
		}
	}

	@Override
	public String createProduct(Product product) throws ProductException {
		
		if(product==null) throw new ProductException("Product can't be null");
		
		productRepository.save(product);
		
		return "Product saved to database successfully...";
	}


	
	@Override
	public Product deleteProductById(Integer id) throws ProductException {
		
		Optional<Product> optional = productRepository.findById(id);
		
		if(optional.isPresent()) {
			
			Product product = optional.get();
			
			productRepository.deleteById(id);
			
			return product;
			
		}
		else {
			throw new ProductException("No Such Product Found......");
		}
		
	}
	
	

	@Override
	public Product updateProduct(Product product) throws ProductException {
		
		Optional<Product> optional = productRepository.findById(product.getId());
		
		if(optional.isPresent()) {
			
			Product existedProduct = optional.get();
			
			ProductDTO productDTO = new ProductDTO();
			
			existedProduct.setName(product.getName());
			existedProduct.setBrand(product.getBrand());
			existedProduct.setCategory(product.getCategory());
			existedProduct.setPrice(product.getPrice());
			
			Product updatedProduct = productRepository.save(existedProduct);
			
			return updatedProduct;
		}
		else {
			throw new ProductException("No Such Product found......"); 
		}
		
	}
	
}





