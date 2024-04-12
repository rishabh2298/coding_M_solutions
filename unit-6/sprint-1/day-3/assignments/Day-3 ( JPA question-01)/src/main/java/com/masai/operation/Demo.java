package com.masai.operation;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.model.Product;
import com.masai.util.DBUtil;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		EntityManager em = DBUtil.provideConnection();
		
		em.getTransaction().begin();
		
		System.out.println("Enter the product Id");
		int productId = input.nextInt();
		
		Product product = em.find(Product.class, productId);
		
		if(product!=null) {
			System.out.println(product);
		}
		else {
			System.out.println("No such product with this id exist...");
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		input.close();
		
	}

}
