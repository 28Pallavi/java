package com;
import java.util.Scanner;

class Calculator{
	
	//static method with two argument
	static int calculate(int num1,int num2) {
		return num1*num2;
	}
	
	//static method with three argument
		static int calculate(int num1,int num2,int num3) {
			return num1*num2*num3;
		}
}

public class OverloadingExample {

	public static void main(String[] args) {
		// user inputs num1
		Scanner s= new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1=s.nextInt();
		//input num2
		System.out.println("Enter num2 :");
		int num2=s.nextInt();
		//input num3
		System.out.println("Enter num3 :");
		int num3=s.nextInt();
		
		System.out.println("Multification of two numbers are :" + Calculator.calculate(num1,num2));
		System.out.println("Multification of three numbers are :" + Calculator.calculate(num1,num2,num3));

	}

}
