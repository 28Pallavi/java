package com;

public class EmployeeDetail {
	
	//Declaring variable as a private
	private int emp_id;
	private String emp_name;
	private double emp_sal;
	private long emp_ph;
	
	//getter and setter methods for accessing private variables
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}
	public long getEmp_ph() {
		return emp_ph;
	}
	public void setEmp_ph(long emp_ph) {
		this.emp_ph = emp_ph;
	}	

}
