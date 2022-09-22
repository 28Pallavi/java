package com.jpa;

import java.util.Scanner;

import com.jpa.daoimpl.CustomerDaoImpl;

public class App 
{
    public static void main(String[] args )
    {
        CustomerDaoImpl cdao = new CustomerDaoImpl();
        char a;
        do {
        	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
        	System.out.println("Customer Registration");
        	System.out.println("Enter your choice");
        	System.out.println("1.Add \n 2.Read \n 3.Update \n 4.Delete \n 5.Exit");
        	int ch = sc.nextInt();
        	
        	switch(ch) {
        	
        	case 1 : cdao.addCustomer();
        	break;
        	
        	case 2 : cdao.getCustomerBy();
        	break;
        	
        	case 3 : cdao.updateCustomer();
        	break;
        	
        	case 4 : cdao.deleteCustomer();
        	break;
        	
        	case 5 : 
        		System.exit(0);
        		break;
        		default: 
        			System.out.println("invalid choice");
        	}
        	System.out.println("Do you want to continue ? Y/N");
        	a=sc.next().charAt(0);
        }
        while(a=='Y' || a=='y');
        System.out.println("Thank you");
    }
}
