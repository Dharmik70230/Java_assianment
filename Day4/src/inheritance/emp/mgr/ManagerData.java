package inheritance.emp.mgr;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class ManagerData extends EmployeeData {
	
	public Manager getEmployee() {
		return new Manager();
		
	}

}
