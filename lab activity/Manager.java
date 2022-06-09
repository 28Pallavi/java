package lab;

//child class 
public class Manager extends Employee {
	
	public Manager(long Id, String Name, String Add, long Phone, double Salary) {
		super(Id,Name, Add, Phone);
		empId = Id;
		empName = Name;
		empAdd = Add;
		empPhone = Phone;
		this.basicSalary = Salary;
	}
	
	
	

}
