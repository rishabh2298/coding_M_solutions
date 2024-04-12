package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entity.Product;
import com.masai.util.EMUtil;

public class DaoMethodImpl implements DaoMethod {

	public String addProduct(Product product) {

		EntityManager em = EMUtil.provoidEntityManager();
		
		em.getTransaction().begin();
		
		if(product==null) return "fail to add Product";
		
		em.persist(product);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Product added successfully";
	}

	public Product getProductById(int id) {

		EntityManager em = EMUtil.provoidEntityManager();
		
		em.getTransaction().begin();
		
		Product product = em.find(Product.class, id);
		
		if(product==null) return null;
		
		em.getTransaction().commit();
		
		em.close();
		
		return product;
	}

}
