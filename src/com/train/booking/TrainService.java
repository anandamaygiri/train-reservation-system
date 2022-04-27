package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {
	
	private static List<Train> allTrains=new LinkedList<>();
	
	static {
		allTrains.add(new Train(101,"Train-One","Digha","Howrah",100,800,LocalDate.now()));
		allTrains.add(new Train(102,"Train-Two","Howrah","Digha",100,800,LocalDate.now()));
		allTrains.add(new Train(103,"Train-Three","Digha","Puri",80,900,LocalDate.now()));
		allTrains.add(new Train(104,"Train-Four","Puri","Digha",80,900,LocalDate.now()));
		allTrains.add(new Train(105,"Train-Five","Digha","Chennai",100,1800,LocalDate.now()));
		allTrains.add(new Train(106,"Train-Six","Chennai","Digha",100,1800,LocalDate.now()));
	}

	public TrainService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Train findTrain(int trainNumber) {
		Train temp = null;
		for(Train t: allTrains) {
			if(t.getTrainNumber()==trainNumber) {
				temp = t;
				break;
			}
		}
		return temp;
	}
	public static void searchTrainsBetweenStatins(String fromStation,String toStation,LocalDate doj,int numOfSeats) {
		List<Train> searchTrainList = new LinkedList<>();
		for(Train t :allTrains) {
			if(t.getFromStation().equals(fromStation)&&
					t.getToStation().equals(toStation)&&
					t.getDoj().equals(doj)&&
					t.getSeatsAvailable()> numOfSeats) {
				searchTrainList.add(t);
				
			}
		}
		if(searchTrainList.size()==0) {
			System.out.println("Sorry , no maching trains available for the search criteria..");
		}else {
			System.out.println("Tr.No\tTrain Name\tFrom Station\tTo Station\tDoj\tSeats Available\tFare");
			System.out.println();
			for(Train t: searchTrainList) {
				System.out.printf("%4d%20s%15s%15s%12s%4d%5d\n",t.getTrainNumber(),t.getTrainName(),t.getFromStation(),t.getToStation(),t.getDoj(),t.getSeatsAvailable(),t.getFare());
			}
		}
		
	}
	
	public static void bookTickets(int trainNumber,List<passenger> passengerList) {
		
		// step-1:we need to subtract the train fare for all passenger together from the bank account object.
		int numOfSeats = passengerList.size();
		/*
		  passenger tempPassenger = passengerList.get(0); 
		  BankAcount account = tempPassenger.getBankAcount();
		 */
		BankAcount account = passengerList.get(0).getBankAcount();
		
		Train tempTrain = findTrain(trainNumber);
		int fare = tempTrain.getFare();
		int totalFare = fare * numOfSeats;
		account.withdrawn(totalFare);
		
		//Step-2: we need to subtract the number of seats that are being booked,from the actual available no of seats.
		tempTrain.setSeatsAvailable(tempTrain.getSeatsAvailable() - numOfSeats);
		
		// Step-3: we need to add one entry(one record) into ticket collections.
		TicketService.addNewTicket( trainNumber,passengerList);
		
	}
	

}
