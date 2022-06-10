package com;

// Parameter constructor
public class ConstructorExample1 {
	//instance variables
		int id; 
		String studentName; 
		double fees;
		
		public ConstructorExample1(int id,String studentName,double fees) {
			this.id=id;
			this.studentName=studentName;
			this.fees=fees;
		}
		
		//method to display values
		void display() {
			System.out.println(id + " " + studentName + " " + fees);
		}

	public static void main(String[] args) {
		// creating object for method invoke & passing project
		ConstructorExample1 c= new ConstructorExample1(101,"Pallavi",678.90);
		c.display();   //display values with object


	}

}
