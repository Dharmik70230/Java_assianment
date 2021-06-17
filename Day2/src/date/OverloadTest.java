package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine ob = new MathEngine();

		int res = ob.multiply(4, 5);
		System.out.println(res);

		ob.multiply(8, 7, 9);

		float res1 = ob.multiply(3, 4.5f);
		System.out.println(res1);

		float res2 = ob.multiply(8.5f, 5);
		System.out.println(res2);

	}

}//end of the class
