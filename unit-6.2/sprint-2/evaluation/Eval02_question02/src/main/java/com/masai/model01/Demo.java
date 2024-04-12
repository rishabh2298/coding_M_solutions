//package com.masai.model01;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
//import com.masai.util.EMUtil;
//
//public class Demo {
//
//	public static void main(String[] args) {
//
//		Movie movie1 = new Movie("Harish", 4.6, Subscription.ACTIVE,"Harry Potter", "Fantasy");
//		Movie movie2 = new Movie("Ajay", 4, Subscription.INACTIVE,"Alibaba", "Fantasy");
//		Movie movie3 = new Movie("Manoj", 5, Subscription.INACTIVE,"Don", "Crime");
//		Movie movie4 = new Movie("Suresh", 4.2, Subscription.ACTIVE,"Bahubali", "Thrill");
//		
//		
//		Series series1 = new Series("Game Of Thrones", 10, "Pankaj", 4, Subscription.ACTIVE);
//		Series series2 = new Series("Lucifer", 10, "Manoj", 4.4, Subscription.INACTIVE);
//		Series series3 = new Series("Naruto", 50, "Raj", 5, Subscription.ACTIVE);
//		Series series4 = new Series("Dragon ball Z", 60, "Gopi", 4.8, Subscription.ACTIVE);
//		
//		
//		EntityManager em = EMUtil.provideEntityManager();
//		
//		em.getTransaction().begin();
//		
//		em.persist(movie1);
//		em.persist(movie2);
//		em.persist(movie3);
//		em.persist(movie4);
//		
//		
//		em.persist(series1);
//		em.persist(series2);
//		em.persist(series3);
//		em.persist(series4);
//		
//		em.getTransaction().commit();
//		
//		
//		
//		
//		
//		em.getTransaction().begin();
//		
//		Query query = em.createQuery("Select m from Movie m");
//		
//		List<Movie> movies = (List<Movie>)query.getResultList();
//		
//		System.out.println("All movies are :-");
//		
//		movies.forEach(m -> System.out.println(m));
//		
//		em.getTransaction().commit();
//		
//		em.close();
//		
//	}
//
//}
