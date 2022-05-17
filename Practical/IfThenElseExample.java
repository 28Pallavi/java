package ifelse;

public class IfThenElseExample {

	public static void main(String[] args) {
		
		int examScore = 82;
		char grade;
		
		if(examScore >= 90) {
			grade = 'A';
		}
		else if(examScore >= 80) {
			grade = 'B';
		}
		else if(examScore >= 70) {
			grade = 'C';
		}
		else if(examScore >= 60) {
			grade = 'D';
		}
		else {
			grade='F';
		}
		System.out.println("The grade is " + grade);
		
	}

}
