package containmnet;

import containmanet.date.MyDate;
import containment.emp.Employee;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Employee em = new Employee();
		em.setEmpId(23);
		em.setName("Jay");
		em.setBirthDate(new MyDate(9,7,1999));
		System.out.println(em);
		
		System.out.println(" Parameterized Constructor");
		Employee em1 = new Employee();
		em.Display();
	}

}
