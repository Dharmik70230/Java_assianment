package com.phoenix.designpatterns.singleton;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//singleton class using Single Design pattern
public class Sun {

	private static Sun ob;

	private Sun() {
		System.out.println("Sun object is Create");
	}
	public static Sun getInstance() {
		if(ob==null) {
			ob = new Sun();
		}
		return ob;
	}
	public void giveLight() {
		System.out.println("Sun give Light");
	}
}
