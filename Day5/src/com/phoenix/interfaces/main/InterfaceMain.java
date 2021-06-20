package com.phoenix.interfaces.main;

import com.phoenix.interfaces.Movable;
import com.phoenix.living.pet.Cat;
import com.phoenix.living.wild.Tiger;
import com.phoenix.machines.HumanRobot;
import com.phoenix.planets.Earth;
import com.phoenix.planets.Jupiter;
import com.phoenix.planets.Planet;
import com.phoenix.vehicles.cars.Car;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 16-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable ob1 = new Earth();
		((Planet) ob1).setNoOfMoon(1);
		((Earth)ob1).move();
		((Earth) ob1).rotate();
		((Earth) ob1).revolve();
		System.out.println(((Earth)ob1).toString());
		
		System.out.println("-----------------------");
		
		ob1 = new Jupiter();
		((Planet) ob1).setNoOfMoon(79);
		((Jupiter)ob1).move();
		((Jupiter) ob1).rotate();
		((Jupiter) ob1).revolve();
		System.out.println(((Jupiter)ob1).toString());
		
		System.out.println("-----------------------");
		
		ob1 = new Tiger();
		((Tiger)ob1).move();
		((Tiger) ob1).jump();
		((Tiger) ob1).run();
		((Tiger) ob1).walk();
		
		System.out.println("-----------------------");
		
		ob1 = new Cat();
		ob1.move();
		((Cat) ob1).jump();
		((Cat) ob1).run();
		((Cat) ob1).walk();
		
		
		System.out.println("-----------------------");
		
		ob1 = new Car();
		((Car)ob1).start();
		((Car)ob1).move();
		((Car) ob1).run();
		((Car)ob1).stop();
		
		
		System.out.println("-----------------------");
		
		ob1 = new HumanRobot();
		ob1.move();
		((HumanRobot) ob1).jump();
		((HumanRobot) ob1).run();
		((HumanRobot) ob1).walk();
		
		
		
	}

}
