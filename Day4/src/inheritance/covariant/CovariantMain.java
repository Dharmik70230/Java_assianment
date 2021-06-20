package inheritance.covariant;

import inheritance.emp.Employee;
import inheritance.emp.EmployeeData;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
import inheritance.emp.mgr.ManagerData;
import inheritance.emp.wage.WageEmpData;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details");
		EmployeeData ob = new EmployeeData();
		Employee e = ob.getEmployee();
		e.display();
		
		System.out.println();
		
		System.out.println("Manager Details");
		ManagerData ob1 = new ManagerData();
		Manager m = ob1.getEmployee();
		m.display();
		m.showIncentives();
		
		System.out.println();
		
		System.out.println("Wage Details");
		WageEmpData ob3 = new WageEmpData();
		WageEmp w = ob3.getEmployee();
		w.display();
		w.calculateWage();
	}

}
