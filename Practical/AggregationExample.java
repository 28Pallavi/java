package com;

//Employee has a department

class Department{
	//declare variables
	int deptId;
	String deptName;
	String deptHod;
	
	//parameter constructor
	public Department(int deptId,String deptName,String deptHod) {
		this.deptId=deptId;
		this.deptName=deptName;
		this.deptHod=deptHod;
	}
}

class Employe{
	//declare variables
	int id;
	String empName;
	String empAddr;
	Department dept;
	
	//parameter constructor
	public Employe(int id,String empName,String empAddr,Department dept) {
		this.id=id;
		this.empName=empName;
		this.empAddr=empAddr;
		this.dept=dept;
	}
	
	//non-static method to display value
	void display() {
		System.out.println(id + " " + empName + " " + empAddr); //Employe variables
		System.out.println(dept.deptId + " " + dept.deptName + " " + dept.deptHod); //department variables
		
	}
	
}

public class AggregationExample {

	public static void main(String[] args) {
		
		//Creating object for department
		Department d=new Department(1,"cs","xyz");
		Department d1=new Department(2,"IT","ABC");
		
		//creating object for Employee
		Employe e=new Employe(101,"Pallavi","Pune",d);
		Employe e1=new Employe(102,"Neha","Mumbai",d1);
		
		//invoke method
		e.display();
		e1.display();
		
		
		
		
		
		

	}

}
