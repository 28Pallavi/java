package com;

public class Employee {
	int emp_id;
	String emp_name;
	double emp_sal;
	long emp_ph;
	
	void show() {
		System.out.println("Employee details are: ");
	}
	
	void display(int i,String n,double s,long p) {
		emp_id=i;
		emp_name=n;
		emp_sal=s;
		emp_ph=p;
		
		System.out.println(emp_id + " " + emp_name + " " + emp_sal + " " + emp_ph);
		
		
	}

	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e1= new Employee();
		Employee e2= new Employee();
		
		e.show();
		e.display(101,"Pallavi",23000.45,90066778);
		e1.display(102,"Neha",12003.3,796534456);
		e2.display(103,"shivshakti",18000.23,835756757);
		
		

	}

}
