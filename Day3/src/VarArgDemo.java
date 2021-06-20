/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class VarArgDemo {

	public static double average(int... a) {

		double result, s = 0;
		int b = a.length;
		for (int i : a)
			s += i;
		result = s / b;

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Average is :- " + average(10,20,30));
		

	}

}
