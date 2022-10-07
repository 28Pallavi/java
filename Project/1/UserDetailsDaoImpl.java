package com.labActivity.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.labActivity.config.HibernateUtil;
import com.labActivity.dao.UserDetailsDao;
import com.labActivity.entity.UserDetails;


public class UserDetailsDaoImpl implements UserDetailsDao {

	Session s = HibernateUtil.getSessionFactory().openSession();
	Transaction t = s.beginTransaction();
	Scanner sc = new Scanner(System.in);
	
	public void getUserDeatils() {
		System.out.println("Enter customer id");
		int i=sc.nextInt();
		UserDetails us = s.get(UserDetails.class, i);
		System.out.println(us.getUid() + " " + us.getUfname() + " " + us.getUlname() + " " + us.getUemail());
	}

	@SuppressWarnings("deprecation")
	public void addUserDetails() { 
		String f,l,e;
		System.out.println("Enter first name");
		f=sc.next();
		
		System.out.println("Enter last name");
		l=sc.next();
		
		System.out.println("Enter email id");
		e=sc.next();
		
		System.out.println("Enter phone number");
		long p = sc.nextLong();
		
		UserDetails u = new UserDetails();
		u.setUfname(f);
		u.setUlname(l);
		u.setUemail(e);
		u.setCphone(p);
		
		s.save(u);
		t.commit();
	}

	@SuppressWarnings("deprecation")
	public void updateUserDetails() {
		
		System.out.println("Enter user id");
		int i=sc.nextInt();
		System.out.println("Enter phone number");
		long pp = sc.nextLong();
		UserDetails u1 = s.get(UserDetails.class,i);
		u1.setCphone(pp);
		s.update(u1);
		t.commit();
		
	}

	@SuppressWarnings("deprecation")
	public void deleteUserDetails() {
		
		System.out.println("Enter customer id");
		int i=sc.nextInt();
		UserDetails u2 = s.get(UserDetails.class,i);
		s.delete(u2);
		System.out.println("delete successfully");
		t.commit();
	}

}
