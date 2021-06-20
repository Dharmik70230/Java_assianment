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
public class inheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-ogenerated method stub

		Employee ob = new Employee(1, "Dharmik", 15000);
		ob.display();
		System.out.println(ob);
		
		Manager ob1 = new Manager();
		ob1.showIncentives();
		ob1.display();
		System.out.println(ob1);
		
		Manager ob2 = new Manager(2,"Jaimmen",30000, 2000);
		ob2.showIncentives();
		ob2.display();
		System.out.println(ob2);
		
		WageEmp ob4 = new WageEmp();
		ob4.calculateWage();;
		ob4.display();
		System.out.println(ob4);
		
		WageEmp ob3 = new WageEmp(3,"Keval",8, 2.5f);
		ob3.calculateWage();;
		ob3.display();
		System.out.println(ob3);
		
	}

		
		
		
		
		
}
