
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 8-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String str)
	    {
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j))
	                return false;
	            i++;
	            j--;
	        }
	return true;
	}

	public static void main(String[] args)
	    {
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       	 
	        if (checkPalindrome(str))
	            System.out.print("Given String is Palindrome");
	        else
	            System.out.print("Given String is Palindrome");
	    }
}
