package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Roatatable;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public abstract class Planet implements Movable,Roatatable,Revolvable{
	private int noOfMoon;
	
	public int getNoOfMoon() {
		return noOfMoon;
	}
	public void setNoOfMoon(int noOfMoon) {
		this.noOfMoon = noOfMoon;
	}
	
	protected  boolean supportsLife() {
		return false;
	}
	public String toString() {
		return "Number Of Moon is :-  " + noOfMoon;
	}
}
