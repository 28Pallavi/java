package com.labActivity;

import java.util.Scanner;

import com.labActivity.daoimpl.UserDetailsDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	UserDetailsDaoImpl udao = new UserDetailsDaoImpl();
        char a;
        do {
        	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
        	System.out.println("User Registration");
        	System.out.println("Enter your choice");
        	System.out.println("1.Add \n 2.Read \n 3.Update \n 4.Delete \n 5.Exit");
        	int ch = sc.nextInt();
        	
        	switch(ch) {
        	
        	case 1 : udao.addUserDetails();
        	break;
        	
        	case 2 : udao.getUserDeatils();
        	break;
        	
        	case 3 : udao.updateUserDetails();
        	break;
        	
        	case 4 : udao.deleteUserDetails();
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
