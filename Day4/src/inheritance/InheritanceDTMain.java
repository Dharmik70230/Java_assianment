package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class InheritanceDTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob;
		
		ob = new Manager(1,"Raj",25000, 2000);
		ob.display();
		((Manager)ob).showIncentives();
		
		ob = new WageEmp(1,"Shivani",9,2.5f);
		ob.display();
		((WageEmp)ob).calculateWage();

	}

}
