package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.BookDao;
import com.masai.dao.BookDaoImpl;
import com.masai.exception.BookException;

public class GetBookById {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Book Id");
		int bookId = scanner.nextInt();
		
		
		BookDao dao = new BookDaoImpl();
		
		try {
			System.out.println(dao.getBookById(bookId));
			
		} catch (BookException e) {
			
			System.out.println(e.getMessage());
		}
		
		scanner.close();
		
	}
	
}
