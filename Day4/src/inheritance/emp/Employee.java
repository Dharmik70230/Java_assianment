package inheritance.emp;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Employee {
	//data members
	private int empId;
	private String name;
	private double salary;

	//default Constructor
	public Employee() {
		  empId = 1;
		  name = "Dharmik";
		  salary = 10000;
	}
	//parameterized Constructor
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	//parameterized Constructor
	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	//display the employee details
	public void display() {
		System.out.println(" EmpID :- " + empId);
		System.out.println(" Name :- " + name);
		System.out.println(" Salary :- " + salary);
	}

	public String toString() {
		return ("EmpID :- " + empId + "  Name :- " + name + " Salary :- " + salary);
	}

}
