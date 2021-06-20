package inheritance.emp.mgr;

import inheritance.emp.Employee;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Manager extends Employee {
	// data member
	private double incentives;

	// default Constructor
	public Manager() {
		incentives = 5000;

	}

	// parameterized Constructor
	public Manager(int empId, String name, double salary, double incentives) {

		super(empId, name, salary);
		this.incentives = incentives;

	}

	// print the details of incentives
	public void showIncentives() {

		System.out.println("Incentives :-" + incentives);
	}

	// display the manager details and call the superclass display method
	public void display() {
		super.display();
	}

	public String toString() {
		return super.toString();
	}

}
