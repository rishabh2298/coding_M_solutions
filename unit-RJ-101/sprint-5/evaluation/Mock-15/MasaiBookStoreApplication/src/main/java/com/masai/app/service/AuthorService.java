package com.masai.app.service;

import com.masai.app.exception.AuthorNotFoundException;
import com.masai.app.model.Author;

public interface AuthorService {

	public Author maxSaleBookAuthor() throws AuthorNotFoundException;

	public Author deleteAuthor(Integer authorId) throws AuthorNotFoundException;
	
}
