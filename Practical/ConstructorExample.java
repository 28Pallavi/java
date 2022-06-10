package com;

//default constructor
public class ConstructorExample {
	//instance variables
	int id; //0
	String studentName; //null
	double fees;  //0.0
	
	//method to display values
	void display() {
		System.out.println(id + " " + studentName + " " + fees);
	}

	public static void main(String[] args) {
		// creating object for method invoke
		ConstructorExample c= new ConstructorExample();
		c.display();   //display values with object

	}

}
