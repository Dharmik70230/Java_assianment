package com.phoenix.designpatterns.singleton;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//singleton class using Single Design pattern
public class President {

	private static President ob;

	private President() {
		System.out.println("President object is Create");
	}
	public static President getInstance() {
		if(ob==null) {
			ob = new President();
		}
		return ob;
	}
	public void representNation() {
		System.out.println("President Represent Nation ");
	}
}
