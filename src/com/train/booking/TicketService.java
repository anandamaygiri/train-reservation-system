package com.train.booking;

import java.util.LinkedList;
import java.util.List;

public class TicketService {
	
	private static List<Ticket> allTickets = new LinkedList<>();
	
	public static void addNewTicket( int trainNumber, List<passenger> passengerList) {
		int pnr = allTickets.size()+1;
		Train bookedTrain= TrainService.findTrain(trainNumber);
		allTickets.add(new Ticket(pnr,bookedTrain,passengerList));
		System.out.println("Ticket Booked Successfully....");
		
	}
	
	public static void showTicketDetails(int pnr) {
		
		Ticket tempTicket = null;
		for(Ticket t:allTickets) {
			if (t.getPnr()==pnr) {
				tempTicket=t;
				break;
			}
		}
		Train tempTrain = tempTicket.getBookedTrain();
		List<passenger>passengerList = tempTicket.getPassengerList();
		int totalFare=tempTrain.getFare() * passengerList.size();
		
		System.out.println("*******Your Booking Details*******");
		System.out.println("PNR=>"+tempTicket.getPnr()+"Tr.No"+tempTrain.getTrainNumber());
		System.out.println("Train Name :"+tempTrain.getTrainName());
		System.out.println("From Station: "+ tempTrain.getFromStation()+"To Station: "+tempTrain.getToStation());
		System.out.println("DOJ : "+tempTrain.getDoj()+"   Fare: "+tempTrain.getFare() +"  Total Fare: "+totalFare);
		System.out.println("\nPassenger info bellow\n");
		
		System.out.println("Passenger Name      age");
		for(passenger p: passengerList) {
			System.out.println(p.getPassengerName()+" \t\t  "+p.getAge());
		}
		System.out.println("**********************************");
		
		
		
		
		
	}

}
