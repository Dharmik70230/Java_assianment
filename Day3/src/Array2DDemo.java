/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 10-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class Array2DDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[2][4];
		arr[0][3] = 3;
		
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int arr1[][] = { {2,3,4,5},{6,7,8,9} };
		for(int i = 0 ; i < arr1.length;i++) {
			for(int j = 0 ; j < arr1[i].length ; j++) {
				System.out.println(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
