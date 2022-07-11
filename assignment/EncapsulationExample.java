package com;
import java.util.Scanner;

public class EncapsulationExample {

	public static void main(String[] args) {
		
		//object creation for accessing variables
		EmployeeDetail e = new EmployeeDetail();
		
		//Scanner class to take value from user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp_id :");
		int emp_id=sc.nextInt();
	    e.setEmp_id(emp_id);
	    
	    System.out.println("Enter emp_name:");
		String emp_name=sc.next();
		e.setEmp_name(emp_name);
		
	    System.out.println("Enter emp_sal:");
	    double emp_sal=sc.nextDouble();
	    e.setEmp_sal(emp_sal);
	    
	    System.out.println("Enter emp_ph:");
	    long emp_ph=sc.nextLong();
	    e.setEmp_ph(emp_ph);
	    
	    System.out.println("Employee Details");
	    
	    System.out.println("Employee ID :" + e.getEmp_id());
	    System.out.println("Employee Name :" + e.getEmp_name());
	    System.out.println("Employee Salary :" + e.getEmp_sal());
	    System.out.println("Employee Phone :" + e.getEmp_ph());
	  
	}

}
