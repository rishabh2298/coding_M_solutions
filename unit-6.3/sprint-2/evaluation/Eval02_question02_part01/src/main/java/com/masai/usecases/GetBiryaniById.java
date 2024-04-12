package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.VegBiryani;
import com.masai.util.EMUtil;

public class GetBiryaniById {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		EntityManager em = EMUtil.provideEntityManager();

		
		System.out.println("Enter Id");
		int id = sc.nextInt();
		
		
		Query query= em.createNamedQuery("VegBiryani.byId");
		query.setParameter("id", id);
		
		List<VegBiryani> biryanis = query.getResultList();
		
		
		if(biryanis.isEmpty()) System.out.println("No biryani with this id");
		else {
			System.out.println(biryanis.get(0));
		}
		
	}

}
