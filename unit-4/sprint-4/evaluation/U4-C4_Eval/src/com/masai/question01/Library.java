package com.masai.question01;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Library {
	
	public static List<Book> getUniqueData(List<Book> books){
		
		LinkedHashSet<Book> lh = new LinkedHashSet<>(books);
		
		return new ArrayList<>(lh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> booksCollection = new ArrayList<>();
		
		booksCollection.add(new Book(1,"Name 1","Author 1"));
		booksCollection.add(new Book(2,"Name 2","Author 1"));
		booksCollection.add(new Book(3,"Name 1","Author 1"));
		booksCollection.add(new Book(1,"Name 4","Author 2"));
		
		List<Book> result = getUniqueData(booksCollection);

		for(Book b:result) {
			System.out.println(b);
		}
		
	}

}
