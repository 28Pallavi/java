package com;


class Calculator1{
	
	//static method 
	static int calculate(int num1,int num2) {
		return num1*num2;
	}
	
	//static method 
		static double calculate1(double num1,double num2) {
			return num1*num2;
		}
}

public class OverloadingExample1 {

	public static void main(String[] args) {
		
		System.out.println("Multification of two numbers are :" + Calculator1.calculate1(45,60));
		System.out.println("Multification of two numbers are :" + Calculator1.calculate1(45.5,77.9));
	

	}

}
