package com.masai.question03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
	
	List<Book> list = new ArrayList<>();
	
	
	public void addBook(Book book) throws BookException {
		if(!list.contains(book)) {
			list.add(book);
		}
		else {
			throw new BookException("This book is already exist in library");
		}
	}

	
	public List<Book> viewAllBooks() throws BookException {
		if(list.size() > 0) {
			
			Comparator<Book> sort = (b1,b2) -> b1.getBookName().compareToIgnoreCase(b2.getBookName());
			
			Collections.sort(list,sort);
			
			return list;
		}
		else {
			throw new BookException("Library has no books");
		}
	}
	
	
	public List<Book> viewBooksByAuthor(String author){
		
		
		return null;
	}
	
	public static void main(String[] args) {
		
	}
	
}
