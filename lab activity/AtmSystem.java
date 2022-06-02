package com;
import java.util.Scanner;
class Account{
	int acc_no;
	String acc_name;
	double acc_amount;
	
	void insertDetails(int i, String a, double amt) { //method to initialize object
		acc_no = i;
		acc_name = a;
		acc_amount = amt;
	}
	
	void deposit(double amt) {
		acc_amount = acc_amount + amt;
		System.out.println("amount deposited successfully...");
	}
	
	void withdraw(double amt) {
		if(acc_amount <amt) {
			System.out.println("No balance");
		}else {
		acc_amount = acc_amount - amt;
		System.out.println("amount withdraw successfully...");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance in account : " +acc_amount);
	}
	
	void exit() {
		System.out.println("Thank you for visit!!");
	}
}


public class AtmSystem {

	public static void main(String[] args) {
		
		System.out.println("What opertion do you want to perform select choice 1.deposit 2.withdraw 3.checkBalance 4.exit");
		Account obj = new Account(); //creating object
		obj.insertDetails(12345, "Pallavi", 15000.34);
		int choice;
		Scanner s = new Scanner(System.in);
		choice=s.nextInt();
		
		switch(choice) {
		
		case 1:obj.deposit(5000);
		break;
		
		case 2:obj.withdraw(2000);
		break;
		
		case 3:obj.checkBalance();
		break;
		
		case 4:obj.exit();
		break;
		
		default:System.out.println("pls enter valis choice");
		
		}
	}
}
