package com.masai.question03;

import java.util.HashSet;

public class Library {
	
	public static void main(String[] args) {
		
		HashSet<Book> books = new HashSet<>();
		
		books.add(new Book(101, "Harry Potter 1", "KaliDas"));
		books.add(new Book(102, "Harry Potter 2", "SurDas"));
		books.add(new Book(104, "Harry Potter 3", "J.K. Rowlings"));
		books.add(new Book(101, "Harry Potter #", "peter parker"));
		
		System.out.println(books);
		
	}

}
