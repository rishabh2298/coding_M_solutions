package com.masai.question01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Library{

	TreeSet<Book> ts = new TreeSet<>(new SortByBookName());
	
	public void addBook(Book book) throws BookException {
		
		if(ts.contains(book)) {
			BookException be = new BookException();
			throw be;
		}
		
		ts.add(book);
		System.out.println("Book Added Successfully");
	}
	
	public List<Book> viewAllBooks() throws BookException{
		
		if(ts.size()==0) {
			BookException be = new BookException();
			throw be;
		}

		List<Book> list = new ArrayList<>(ts);
		
		Collections.sort(list,new SortByBookName());
		return list;
	}
	
	public List<Book> viewBooksByAuthor(String author) throws BookException{
		
		List<Book> list = new ArrayList<>(ts);
		List<Book> sameAuthor = new ArrayList<>();
		
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getAuthor().equals(author)){
				sameAuthor.add(list.get(i));
			}
			else {
				count++;
			}
		}
		if(count==list.size()) {
			BookException be = new BookException();
			throw be;
		}
		
		return sameAuthor;
	}
	
	public Book getBookByISBN(int isbn) throws BookException {
		
		List<Book> list = new ArrayList<>(ts);
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getIsbn()==isbn) {
				return list.get(i);
			}
		}
		BookException be = new BookException();
		throw be;
	}
	
}








