package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//this is MyDateSG class representing date entity
public class MyDateSG {
	//data members
	private int day, month, year;

	//default Constructor
	public MyDateSG() {
		
		System.out.println("Default Constructer");
	}

	public MyDateSG(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		System.out.println("Parameterized Constructer");
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int Month) {
		this.month = Month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	//this method is print date in dd/mm/yyyy format
	public void printDate() {
		System.out.println("Date :- " +day + "/" + month + "/" + year);

	}
}//end of the class
