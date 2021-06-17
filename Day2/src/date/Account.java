package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class Account {

	// data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;

	// static data members
	static float intrestRate;
	static int count = 0;

	// static block
	static {
		intrestRate = 0.06f;

	}

	// default Constructor
	public Account() {
		count++;
	}

	// parameterized Constructor
	public Account(int accNo, String ownerName, double balance, float durationYears) {
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.durationYears = durationYears;
		this.balance = balance;
		count++;

	}

	// getter method for Account number
	public int getAccno() {
		return accNo;
	}

	// setter method for Account number
	public void setAccno(int accNo) {
		this.accNo = accNo;
	}

	// getter method for Owner Name
	public String getOwnername() {
		return ownerName;
	}

	// setter method for Owner Name
	public void setOwnername(String ownerName) {
		this.ownerName = ownerName;
	}

	// getter method for Balance
	public double getBalance() {
		return balance;
	}

	// setter method for Balance
	public void setBalance(int balance) {
		this.balance = balance;
	}

	// getter method for Duration Years
	public float getDurationyears() {
		return durationYears;
	}

	// setter method for Duration Years
	public void setDurationyears(float durationYears) {
		this.durationYears = durationYears;
	}

	// getter method for IntrestRate
	public float getIntrestrate() {
		return intrestRate;
	}

	// setter method for IntrestRate
	public void setIntrestrate(float intrestRate) {
		Account.intrestRate = intrestRate;
	}

	// getter method for Count
	public int getCount() {
		return count;
	}

	//  calculate the intrest
	public void calculateIntrest() {

		double intrest = balance * intrestRate * durationYears;
		System.out.println("Simple Intrest is :- " + intrest);
	}

	// print the details of Account
	public void printDetails() {
		System.out.println("Account Number :- " + accNo);
		System.out.println("Owner Name :- " + ownerName);
		System.out.println("Balance :- " + balance);
		System.out.println("Duration Years :- " + durationYears);
	}

}
