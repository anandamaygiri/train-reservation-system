package com.train.booking;

public class passenger {
	private int passengerId;
	private String passengerName;
	private int age;
	private BankAcount bankAcount;
	public passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public passenger(int passengerId, String passengerName, int age, BankAcount bankAcount) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.age = age;
		this.bankAcount = bankAcount;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public BankAcount getBankAcount() {
		return bankAcount;
	}
	public void setBankAcount(BankAcount bankAcount) {
		this.bankAcount = bankAcount;
	}
	

}
