package com.masai.model02;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.util.EMUtil;

public class Demo_02 {

	public static void main(String[] args) {

		Movie_02 movie1 = new Movie_02("Harish", 4.6, Subscription.ACTIVE,"Harry Potter", "Fantasy");
		Movie_02 movie2 = new Movie_02("Ajay", 4, Subscription.INACTIVE,"Alibaba", "Fantasy");
		Movie_02 movie3 = new Movie_02("Manoj", 5, Subscription.INACTIVE,"Don", "Crime");
		Movie_02 movie4 = new Movie_02("Suresh", 4.2, Subscription.ACTIVE,"Bahubali", "Thrill");
		
		
		Series_02 series1 = new Series_02("Game Of Thrones", 10, "Pankaj", 4, Subscription.ACTIVE);
		Series_02 series2 = new Series_02("Lucifer", 10, "Manoj", 4.4, Subscription.INACTIVE);
		Series_02 series3 = new Series_02("Naruto", 50, "Raj", 5, Subscription.ACTIVE);
		Series_02 series4 = new Series_02("Dragon ball Z", 60, "Gopi", 4.8, Subscription.ACTIVE);
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(movie1);
		em.persist(movie2);
		em.persist(movie3);
		em.persist(movie4);
		
		
		em.persist(series1);
		em.persist(series2);
		em.persist(series3);
		em.persist(series4);
		
		em.getTransaction().commit();
		
		
		
		
		
		em.getTransaction().begin();
		
		// ans(a)
		
		Query query = em.createNamedQuery("get all the series details",Series_02.class);
		
		List<Series_02> series_02s = (List<Series_02>)query.getResultList();
		
		System.out.println("All series are :-");
		series_02s.forEach(s -> System.out.println(s));
		
		em.getTransaction().commit();
		
		
		
		

		em.getTransaction().begin();
		
		// ans(b)
		
		Query query2 = em.createNamedQuery("get movie by id",Movie_02.class);
		
		query2.setParameter("id", 2);
		
		
		List<Movie_02> movie_02s = (List<Movie_02>)query.getResultList();
		
		movie_02s.forEach(m -> System.out.println(m));
		
		
		em.getTransaction().commit();
		
		em.close();
	}

}
