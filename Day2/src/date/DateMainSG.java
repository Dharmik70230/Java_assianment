package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class DateMainSG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDateSG ob1 = new MyDateSG();
		MyDateSG ob2 = new MyDateSG(8, 2, 2013);

		ob1.setDay(8);
		ob1.getDay();
		ob1.getMonth();
		ob1.setMonth(9);
		ob1.getYear();
		ob1.setYear(2013);
		ob1.printDate();

		ob2.getDay();
		ob2.getMonth();
		ob2.getYear();
		ob2.printDate();
	}

}
