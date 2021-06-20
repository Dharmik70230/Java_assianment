package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Cat extends Animal implements Walkable{

	
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat Can jump");
	}

	
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat Can Move");
	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat Can Run");
	}

	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat Can Walk");
	}

}
