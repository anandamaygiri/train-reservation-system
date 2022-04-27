package com.train.booking;

public class BankAcount {
	private int acNumber;
	private int acBalance;
	
	public int getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(int acNumber) {
		this.acNumber = acNumber;
	}
	public int getAcBalance() {
		return acBalance;
	}
	public void setAcBalance(int acBalance) {
		this.acBalance = acBalance;
	}
	public void deposit(int amount) {
		acBalance += amount;
	}
	public void withdrawn(int amount) {
		acBalance -= amount;
	}
	public void showBalance() {
		System.out.println("Account Balance =" + acBalance);
		 
	}
	
}
