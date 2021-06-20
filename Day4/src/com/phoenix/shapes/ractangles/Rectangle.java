package com.phoenix.shapes.ractangles;

import com.phoenix.shapes.Shapes;
/*
 * Auther : dharmik.maru@stl.tech
 * Creation Date : 11-June-2021
 * Version : 1.0
 * Copyright : Sterlite Technologies Ltd.
 */
public class Rectangle extends Shapes {
	
	private int length , breadth ;
	//default Constructor
	 public Rectangle(){
		
	}
	 public Rectangle(int length ,int breadth){
		 
		 this.length = length;
		 this.breadth = breadth;
		 
	 }
	 public void calculateArea() {
			
			float area = (length * breadth);
			System.out.println("Area Of Rectangle :- " + area);
			
		}
		
		public void calculatePerimeter() {

			float perimeter = 2 * ( breadth * length);
			System.out.println("Perimeter Of Rectangle :- " + perimeter);
			
		}
}
