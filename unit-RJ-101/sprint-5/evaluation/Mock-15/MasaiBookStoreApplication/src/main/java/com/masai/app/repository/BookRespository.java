package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Book;

@Repository
public interface BookRespository extends JpaRepository<Book, Integer> {

}
