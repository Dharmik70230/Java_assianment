package containment.emp;

import containmanet.date.MyDate;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Employee {
	
	private int empId;
	private String name;
	private MyDate birthDate;
	
	public Employee() {
		empId = 1;
		name = "Dharmik";
	}
	public Employee(int empId,String name,MyDate birthDate) {
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int e) {
		this.empId = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
	public void Display() {
		System.out.println(" EmpID :- "  + empId);
		System.out.println(" Name :- "  + name);
		System.out.println(" Birth Date :- "  + birthDate);
	}
	public String toString() {
		return ("EmpID :- "+ empId + "  Name :- "  + name + "Birth Date :- "  + birthDate );
	}


}
