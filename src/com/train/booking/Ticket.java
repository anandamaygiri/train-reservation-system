package com.train.booking;

import java.util.List;

public class Ticket {
	private int pnr;
	private Train bookedTrain;
	private List<passenger> passengerList;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int pnr, Train bookedTrain, List<passenger> passengerList) {
		super();
		this.pnr = pnr;
		this.bookedTrain = bookedTrain;
		this.passengerList = passengerList;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public Train getBookedTrain() {
		return bookedTrain;
	}
	public void setBookedTrain(Train bookedTrain) {
		this.bookedTrain = bookedTrain;
	}
	public List<passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<passenger> passengerList) {
		this.passengerList = passengerList;
	}

}
