package lab;


//child class
public class Trainee extends Employee{
	
	//parameter constructor
	public Trainee(long Id, String Name, String Add, long Phone, double Salary) {
		super(Id,Name, Add, Phone);
		empId = Id;
		empName = Name;
		empAdd = Add;
		empPhone = Phone;
		this.basicSalary = Salary;
	}
	

}
