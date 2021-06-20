package com.phoenix.designpatterns.factory.main;

import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.factory.cars.Car;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//invoking factory method
		String carType = args[0];
		Car c = CarFactory.newCar(carType);
		c.start();
		c.run();
		c.stop();
		
	}

}//end of the class
