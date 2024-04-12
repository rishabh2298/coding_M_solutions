package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("from Book")
	public List<Book> getAllBooks();
	
}
