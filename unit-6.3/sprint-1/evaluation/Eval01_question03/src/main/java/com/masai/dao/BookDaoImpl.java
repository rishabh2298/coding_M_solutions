package com.masai.dao;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;

import com.masai.exception.BookException;
import com.masai.model.Book;
import com.masai.util.EMUtil;

public class BookDaoImpl implements BookDao {
	

	@Override
	public Book getBookById(int bookId) throws BookException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Book book = em.find(Book.class, bookId);
		
		if(book==null) throw new BookException("Book with this ID doesn't exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return book;
	}

	
	@Override
	public String createBook(Book book) throws BookException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		book.setCreatedTimeStamp(LocalDateTime.now());
		
		em.persist(book);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Book is added successfully";
	}

	
	@Override
	public Book deleteBookById(int bookId) throws BookException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Book book = em.find(Book.class, bookId);
		
		if(book==null) throw new BookException("Book with this ID doesn't exist");
		
		em.remove(book);
		
		em.getTransaction().commit();
		
		em.close();
		
		return book;
	}

	
	@Override
	public String updateBookPrice(int bookId) throws BookException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Book book = em.find(Book.class, bookId);
		
		if(book==null) throw new BookException("Book with this Id doesn't exist");
		
		book.setPrice(book.getPrice()*2);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Book is update Successfully";
	}

}
