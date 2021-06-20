package com.phoenix.designpatterns.singleton;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//singleton class using Single Design pattern
public class Earth {

	// reference variable
	private static Earth ob;

	// default constructor
	private Earth() {
		System.out.println("Earth object is Create");
	}

	public static Earth getInstance() {

		if (ob == null) {
			ob = new Earth();
		}
		return ob;
	}

	public  void createLife() {
		System.out.println("Earth create Life ");
	}

}
