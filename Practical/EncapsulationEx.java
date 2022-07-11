package com;
import java.util.Scanner;

public class EncapsulationEx {

	public static void main(String[] args) {
		
		Student s =new Student(); //object creation for accesing variables
		//s.setId(101);
		//s.setsName("Pallavi");
		//s.setSEmail("pallavi@gmail.com");
		//s.setsPhone(986544321);
		
		//Scanner class to take value from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id :");
		int id=sc.nextInt();
		s.setId(id);
		
		System.out.println("Enter Name :");
		String n=sc.next();
		s.setsName(n);
		
		System.out.println("Enter Email :");
		String e=sc.next();
		s.setSEmail(e);
		
		System.out.println("Enter Phone :");
		long ph=sc.nextLong();
		s.setsPhone(ph);
		
		System.out.println("Student Details");
		
		System.out.println("Id is :" + s.getId());
	    System.out.println("Name is :" + s.getsName());
	    System.out.println("Phone is :" + s.getsPhone());
	    System.out.println("Email is :" + s.getSEmail());
	}
		

}
