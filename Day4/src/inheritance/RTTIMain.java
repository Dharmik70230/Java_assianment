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
public class RTTIMain {

	public static void showEmpInfo(Employee emp) {

		if (emp instanceof Manager) {
			emp.display();
			((Manager) emp).showIncentives();
		}
		if (emp instanceof WageEmp) {
			emp.display();
			((WageEmp) emp).calculateWage();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager ob = new Manager(3, "Dhruvik", 25800, 1234);
		showEmpInfo(ob);
		WageEmp ob1 = new WageEmp(4, "Vijay", 7, 3.2f);
		showEmpInfo(ob1);
	}

}
