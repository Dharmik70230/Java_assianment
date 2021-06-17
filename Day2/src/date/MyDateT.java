package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//this is MyDateT class representing date entity
public class MyDateT {
	
	//data members
	private int day, month, year;

	//default Constructor
	public MyDateT() {
		this(8, 8, 1234);
	}

	public MyDateT(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//this method is print date in dd/mm/yyyy format
	public void printDate() {
		System.out.println("Date :- " +day + "/" + month + "/" + year);

	}

}//end of the class
