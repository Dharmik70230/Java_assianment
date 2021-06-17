package date;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 9-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//this is MathEngine class representing Constructor overloading
public class MathEngine {

	public int multiply(int a, int b) {
		return a + b;
	}

	public void multiply(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public float multiply(int a, float b) {
		return a + b;
	}

	public float multiply(float a, int b) {
		return a + b;
	}

}
