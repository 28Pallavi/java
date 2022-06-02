package com;

public class StaticExample1 {
	
	//instance variable
	int number=101;
	
	//creating static method
	static void display() {
		String name="Pallavi";
		System.out.println("Name is : " +name);
	}

	public static void main(String[] args) {
		
		//creating object
		StaticExample1 s= new StaticExample1();
		
		System.out.println("Number is :" +s.number); //calling variable to display values
		StaticExample1.display(); //calling static method

	}

}
