/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class ForEach1Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arr[] = new double[4];
		
		for(double i :arr) {
			System.out.println(i);
		}
		
		
		System.out.println("Create Array Without using new Keyword");
		
		float arr1[] = {10,20,30,40,50};
		for(float i:arr1) {
			System.out.println(i);
		}
		

		System.out.println("Print Flowers name");
		
		
		String arr2[] = {"Rose","Lotus","Tulips","Marigold"};
		for(String i:arr2) {
			System.out.println(i);
		}
		

		System.out.println("Print Country");
		
		String arr3[] = {"India","America","Japan","China"};
		for(String i:arr3) {
			System.out.println(i);
		}
		
		
	}
	}


