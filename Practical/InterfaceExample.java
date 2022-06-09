package com;

class Circlee implements Shapee{
    //method overriding 
	@Override
	public void draw() {
		//instance variable
		double pi=3.14;
		double r=25;
		double area=pi*r*r;
		System.out.println("Area of Circle is : " + area);			
	}
	
}

class Rectanglee implements Shapee{
	//method overriding
	@Override
	public void draw() {
		//instance variable
		int Length=10;
		int breadth=20;
		int area=Length*breadth;
		System.out.println("Area of Rectangle is : " + area);	
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		// creating object for Circlee class
		Circlee c = new Circlee();
		c.draw();
				
	   // creating object for Rectanglee class
	    Rectanglee r = new Rectanglee();
	    r.draw();


	}

}
