package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//this is MyDate class representing date entity
public class MyDate {
    //data members
	private int day, month, year;

	//member methods
	//this method is used to initialize date object
	public void initDate() {
		day = 8;
		month = 6;
		year = 2021;
	}
   //this method is print date in dd/mm/yyyy format
	public void printDate() {
		System.out.println("Date :- " +day + "/" + month + "/" + year);
	}

}//end of the class
