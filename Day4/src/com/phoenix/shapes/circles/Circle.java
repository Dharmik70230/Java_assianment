package com.phoenix.shapes.circles;

import com.phoenix.shapes.Shapes;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Circle extends Shapes{

	//data member
	 private float radius;
	//default Constructor
	 public Circle() {
		 
	 }
	 public Circle(float radius) {
		 this.radius = radius;
	 }
	
	public void calculateArea() {
		
		float area = (MATH_PI * radius * radius);
		System.out.println("Area Of Circle :- " + area);
		
	}
	
	public void calculatePerimeter() {

		float perimeter = (2 * MATH_PI * radius);
		System.out.println("Perimeter Of Circle :- " + perimeter);
		
	}
	 
	 
}

