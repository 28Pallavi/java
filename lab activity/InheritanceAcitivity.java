package lab;

public class InheritanceAcitivity {

	public static void main(String[] args) {
		
		//Creating object for Manager class
		Manager m = new Manager(126534,"Peter","Channai India",237844, 6500);
		m.CalculateSalary();
		
		//Creating object for Trainee class
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.CalculateSalary();
		
		

	}

}
