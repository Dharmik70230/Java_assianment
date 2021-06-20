package com.phoenix.shapes.main;

import com.phoenix.shapes.Shapes;
import com.phoenix.shapes.circles.Circle;
import com.phoenix.shapes.ractangles.Rectangle;
import com.phoenix.shapes.square.Square;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shapes ob1 ;
		Shapes ob1 = new Circle(5);
		ob1.calculateArea();
		ob1.calculatePerimeter();
		
		System.out.println();
		Shapes ob2 = new Rectangle(5,6);
		ob2.calculateArea();
		ob2.calculatePerimeter();
		
		System.out.println();

		Shapes ob3 = new Square(2);
		ob3.calculateArea();
		ob3.calculatePerimeter();
		
		
	}

}
