package inheritance.emp;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class WageEmp extends Employee {
	// data member
	private int noOfHours;
	private float ratePerHours;

	//default Constructor
	public WageEmp() {
		noOfHours = 6;
		ratePerHours = 2.5f;

	}
	//parameterized Constructor
	public WageEmp(int empId, String name, int noOfHours, float ratePerHours) {
		super(empId, name);
		this.noOfHours = noOfHours;
		this.ratePerHours = ratePerHours;
	}
	//calculate wage
	public void calculateWage() {

		double pay = noOfHours * ratePerHours;
		System.out.println("Wage :- " + pay);
	}
	//display the wage details and call the superclass display method
	public void display() {
		super.display();

	}

	public String toString() {
		return super.toString();
	}

}
