package com.phoenix.machines;

import com.phoenix.interfaces.Movable;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Robot implements Movable{

	public void processData() {
		System.out.println("Robot Process Data");
	}
	public void senseInfo() {
		System.out.println("Robot Sense Information");
	}
	public void useArtificialIntelligence() {
		System.out.println("Robot Use Artificial Intelligence");
	}
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Robot Can Move");
	}

}
