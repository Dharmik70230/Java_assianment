/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 8-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
import java.util.Scanner;

public class VowelCount {

	public static int vowelCount(String str) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.print(count);
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		vowelCount(str);

	}

}
