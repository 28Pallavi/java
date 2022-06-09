package lab;

//Parent class
public class Employee {
	//instance variable
	long empId;
	String empName;
	String empAdd;
	long empPhone;
	double basicSalary;
	//default variable
	double specialALLowance=250.80;
	double hra=1000.80;
	
	//parameterter constructor
	public Employee(long empId, String empName, String empAdd, long empPhone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empPhone = empPhone;
	}
	
	//calculate basic salary
	public void CalculateSalary() {
		double salary;
		salary=basicSalary+(basicSalary*specialALLowance/100)+(basicSalary*hra/100);
		System.out.println("Employee salary is : " +salary);
	}

}
