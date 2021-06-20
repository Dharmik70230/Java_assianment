package com.phoenix.designpatterns.singleton;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
//singleton class using Single Design pattern
public class PrimeMinister {

	private static PrimeMinister ob;

	private PrimeMinister() {
		System.out.println("PrimeMinister object is Create");
	}
	public static PrimeMinister getInstance() {
		if(ob==null) {
			ob = new PrimeMinister();
		}
		return ob;
	}

	public void serveNation() {
		System.out.println("PrimeMinister Serve Nation ");
	}
}
