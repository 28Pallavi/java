package com;

abstract class Shape{
	//abstract method
	abstract void calculateArea();
}

//child class with inherits abstract class
class Circle extends Shape{
	//override from parent class
	void calculateArea() {
		double pi=3.14;
		double r=25;
		double area=pi*r*r;
		System.out.println("Area of Circle is : " + area);	
	}
}

//child class with inherits abstract class
class Rectangle extends Shape{
	//override from parent class
	void calculateArea() {
		int Length=10;
		int breadth=20;
		int area=Length*breadth;
		System.out.println("Area of Rectangle is : " + area);	
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		
		// creating object for circle class
		Circle c = new Circle();
		c.calculateArea();
		
		// creating object for Rectangle class
	    Rectangle r = new Rectangle();
	    r.calculateArea();
	}

}
