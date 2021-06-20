package com.phoenix.designpatterns.singleton;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a reference of each singleton class
		Earth ob1 = Earth.getInstance();
		ob1.createLife();
		
		System.out.println("-----------------------");
		
		Sun ob2 = Sun.getInstance();
		ob2.giveLight();
		
		System.out.println("-----------------------");
		
		President ob3 = President.getInstance();
		ob3.representNation();
		
		System.out.println("-----------------------");
		
		PrimeMinister ob4 = PrimeMinister.getInstance();
		ob4.serveNation();

	}
}