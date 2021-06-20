package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.vehicles.Vehicle;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Car extends Vehicle implements Runnable,Movable {

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car Run");
	}

	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car Move");
	}

}
