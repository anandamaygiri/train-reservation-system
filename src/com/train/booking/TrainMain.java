package com.train.booking;

import java.time.LocalDate;
import java.util.*;

public class TrainMain {
public static void main(String[]args) {
	System.out.print("Now Searching For Train...");
	TrainService.searchTrainsBetweenStatins("Digha", "Chennai", LocalDate.now(),10);
		
		BankAcount b1=new BankAcount();
		b1.setAcNumber(999);
		b1.setAcBalance(10000);
		
		passenger p1=new passenger(10,"Ananda",30,b1);
		passenger p2=new passenger(20,"Sanat",33,b1);
		passenger p3=new passenger(30,"Dinesh",35,b1);
		
		int initialBalance = b1.getAcBalance();
		List<passenger>passengerList = new LinkedList<>();
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		
		System.out.println("Now booking tickets for 3 passengers in train number 105 ....");
		TrainService.bookTickets(105,passengerList);
		System.out.println("Now printing the ticket details ....");
		TicketService.showTicketDetails(1);
		System.out.println("\n\n");
		TrainService.searchTrainsBetweenStatins("Digha", "Chennai", LocalDate.now(),3);
		int balanceAfterBookingTickets=b1.getAcBalance();
		System.out.println("initial balance = "+initialBalance);
		System.out.println("Balance after booking" + balanceAfterBookingTickets);
		 	
		
		
				
	}
}
