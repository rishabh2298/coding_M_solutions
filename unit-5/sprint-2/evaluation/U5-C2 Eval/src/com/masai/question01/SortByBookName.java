package com.masai.question01;

import java.util.Comparator;

public class SortByBookName implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		
		return (b1.getBookName().compareTo(b2.getBookName()));
	}

}
