package com.masai.question01;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search book by Author");
		System.out.println("4. Search Book by ISBN");
		System.out.println("5. Exit");
		System.out.println();
		System.out.print("Enter your Choice : ");
		int choice = input.nextInt();
		
		Library library = new Library();
		
		while(choice!=5) {
			System.out.print("Enter your Choice : ");
			choice = input.nextInt();
			
			switch(choice) {
			case 1 :{
				
				try {
					System.out.println("Enter the ISBN no.");
					int isbn = input.nextInt();
					
					System.out.println("Enter Book Name");
					input.nextLine();
					String bookName = input.nextLine();
					
					System.out.println("Enter the author Name");
					String author = input.nextLine();
					
					library.addBook(new Book(isbn, bookName, author));
				}
				catch (BookException e) {
					System.out.println("Book is already Exist");
				}
			}
			break;
			case 2:{
				try {
					List<Book> list = library.viewAllBooks();
					
					for(int i=0; i<list.size(); i++) {
						System.out.println(list.get(i));
					}
					
				}
				catch (BookException e) {
					System.out.println("There is no Books in the List");
				}
			}
			break;
			case 3:{
				StringBuilder author = new StringBuilder("");
				try {
					System.out.print("Enter the author name");
					input.nextLine();
					author.append(input.nextLine());
					
					List<Book> list = library.viewBooksByAuthor(author.toString());
					
					for(int i=0; i<list.size(); i++) {
						Book book = list.get(i);
						
						System.out.println("ISBN no = "+book.getIsbn());
						System.out.println("Book Name = "+book.getBookName());
						System.out.println("Author Name = "+book.getAuthor());	
					}
				}
				catch (BookException e) {
					System.out.println("None of the book published by the author "+ author);
				}
			}
			break;
			case 4:{
				try {
					System.out.println("Enter ISBN no : ");
					int isbn = input.nextInt();
					
					Book book = library.getBookByISBN(isbn);
				}
				catch (BookException e) {
					System.out.println("Book of this ISBN no is not in Library.");
				}
			}
			break;
			case 5:{
				System.out.println("Thankyou");
			}
			}
			
		}
		
		System.out.println("Thankyou");

	}

}
