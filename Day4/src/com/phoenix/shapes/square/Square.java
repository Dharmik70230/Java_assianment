package com.phoenix.shapes.square;

import com.phoenix.shapes.Shapes;

/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Square extends Shapes {

	private int side;
	//default Constructor
	public Square() {

	}
	//parameterized Constructor
	public Square(int side) {

		this.side = side;

	}

	public void calculateArea() {

		float area = side * side;
		System.out.println("Area Of Square :- " + area);

	}

	public void calculatePerimeter() {

		float perimeter = 4 * side;
		System.out.println("Perimeter Of Square :- " + perimeter);

	}

}
