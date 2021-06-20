/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		
		for(int i = 0 ;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Create Array Without using new Keyword");
		
		int arr1[] = {10,20,30,40,50};
		for(int i = 0 ;i< arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		

		System.out.println("Print City");
		
		
		String arr2[] = {"Surat","Vadodra","Rajkot","Ahemedabad"};
		for(int i = 0 ;i< arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		

		System.out.println("Print Hobbies");
		
		String arr3[] = {"Reading books","Writing poetry","Cricket","Hearing Songs"};
		for(int i = 0 ;i< arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		
	}

}
