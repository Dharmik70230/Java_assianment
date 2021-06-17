package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ob1 = new Account();
		Account ob2 = new Account(234567891, "Jay", 15000, 1.5f);
		System.out.println("Intrest Rate:- " + Account.intrestRate);
		
		System.out.println();
		
		System.out.println("Default Constructer");
		ob1.setAccno(123456789);
		ob1.setOwnername("Dharmik");
		ob1.setBalance(10000);
		ob1.setDurationyears(1);
		ob1.printDetails();
		ob1.calculateIntrest();
		
		System.out.println();
		
		System.out.println("Parameterized Constructer");
		ob2.printDetails();
		ob2.calculateIntrest();
		
		System.out.println();
		
		System.out.println("Total Number of Account :- " + Account.count);

	}

}
