package com.masai.question04;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>(); 
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public boolean isEmpty(){
		if(bookList.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Book> viewAllBooks(){
		List<Book> resultBooks = new ArrayList<>();
		
		for(Book bookDetails:bookList) {
			
		}
	}
	
	public List<Book> viewBooksByAuthor(String author){
		
	}
	
	public int countNoOfBook(String bookName) {
		
	}
	
}
