package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//this is MyDateC class representing date entity
public class MyDateC {
	//data members
	private int day, month, year;

	//default Constructor
	public MyDateC() {
		day = 8;
		month = 6;
		year = 2021;
		System.out.println("Default Constructer");
	}
	//this method is print date in dd/mm/yyyy format
	public void printDate() {
		System.out.println("Date :- " +day + "/" + month + "/" + year);
	}

}//end of the class
