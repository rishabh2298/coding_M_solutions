package com.masai.question03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Ticket ticket = new Ticket();
		
		
		System.out.print("Enter no of bookings : ");
		int booking = scanner.nextInt();
		System.out.println();
		
		
		System.out.print("Enter the available tickets : ");
		int availableTickets = scanner.nextInt();
		ticket.availableTickets = availableTickets;
		System.out.println();
		
		
		for(int i=1; i<=booking; i++) {
			
			System.out.print("Enter the ticketId : ");
			int ticketId = scanner.nextInt();
			
			System.out.print("Enter the price : ");
			int price = scanner.nextInt();
			ticket.price = price;
			
			System.out.println("Enter the no of tickets : ");
			int noOFTickets = scanner.nextInt();
			
			System.out.println("Available Tickets : "+ticket.availableTickets);
			System.out.println("Total Amount : "+ ticket.calculateTicketCost(noOFTickets));
			System.out.println("Available Ticket after Booking : "+ ticket.availableTickets);
			System.out.println();
			System.out.println();
			
		}

	}

}
