package lab;

import java.util.Scanner;

public class EMP {

	public static void main(String[] args) {
		
		float bsalary,hra,da,totalSalary,gross;
		
		System.out.println("Enter the salary : ");
		Scanner sc = new Scanner(System.in);
        bsalary = sc.nextFloat();
        
        if(bsalary>5000) {
        	hra = 500;
        	da = 90;
        	totalSalary = hra * da * bsalary;
        	System.out.println("Total salary : " + totalSalary);
        }
        else {
        	hra = 200;
        	da = 70;
        	totalSalary = hra * da * bsalary;
        	System.out.println("Total salary : " + totalSalary);
        }	
        
        gross =bsalary+hra+da;
        System.out.println("gross salary :" + gross);

	}

}
