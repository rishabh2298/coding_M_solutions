package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.exception.BookException;
import com.masai.model.Book;

public class CreateNewBook {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Enter Book Name");
		String name = scanner.nextLine();
		
		System.out.println("Enter book author");
		String author = scanner.nextLine();
		
		System.out.println("Enter Publication");
		String publication = scanner.nextLine();
		
		System.out.println("Enter Category");
		String category = scanner.nextLine();
		
		System.out.println("Enter Book Pages");
		int pages = scanner.nextInt();
		
		System.out.println("Enter Book Price");
		double price = scanner.nextDouble();
		
		
		
		Book book = new Book(name, author, publication, category, pages, price);
		
		
		BookDao dao = new BookDaoImpl();
		
		try {
			System.out.println(dao.createBook(book));
			
		} catch (BookException e) {
			
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		
	}
	
}
