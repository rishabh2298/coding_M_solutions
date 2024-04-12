package com.masai.question03;

public class Ticket {
	
	
	int ticketId;
	int price;
	static int availableTickets;
	
	
	public int calculateTicketCost(int noOfTickets) {
		if(noOfTickets>0) {
			
			availableTickets -= noOfTickets;
			int cost = noOfTickets*this.price;
			return cost;
			
		}
		else {
			return -1;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
