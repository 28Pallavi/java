package com.jpa.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jpa.config.HibernateUtil;
import com.jpa.dao.CustomerDao;
import com.jpa.entity.Customer;

public class CustomerDaoImpl implements CustomerDao  {
	
	Session s = HibernateUtil.getSessionFactory().openSession();
	Transaction t = s.beginTransaction();
	Scanner sc = new Scanner(System.in);

	public void getCustomerBy() {
		
		System.out.println("Enter customer id");
		int i=sc.nextInt();
		Customer cd = s.get(Customer.class,i);
		System.out.println(cd.getCid()+ " " + cd.getCfname()+ " " +cd.getClname()+ " " +cd.getCemail()+ " " +cd.getCaddr()+ " " +cd.getCphone());
		
	}

	@SuppressWarnings("deprecation")
	public void addCustomer() {
	
		String f,l,e,a;
		Long p;
		System.out.println("Enter first name");
		f=sc.next();
		
		System.out.println("Enter last name");
		l=sc.next();
		
		System.out.println("Enter email id");
		e=sc.next();
		
		System.out.println("Enter phone number");
		p=sc.nextLong();
		
		System.out.println("Enter address");
		a=sc.next();
		
		Customer c = new Customer();
		c.setCfname(f);
		c.setClname(l);
		c.setCemail(e);
		c.setCphone(p);
		c.setCaddr(a);
		
		s.save(c);
		t.commit();
		
	}

	@SuppressWarnings("deprecation")
	public void updateCustomer() {
		
		System.out.println("Enter customer id");
		int i=sc.nextInt();
		System.out.println("Enter phone number");
		long pp = sc.nextLong();
		Customer cd1 = s.get(Customer.class,i);
		cd1.setCphone(pp);
		s.update(cd1);
		t.commit();
	}

	@SuppressWarnings("deprecation")
	public void deleteCustomer() {
	
		System.out.println("Enter customer id");
		int i=sc.nextInt();
		Customer cd2 = s.get(Customer.class,i);
		s.delete(cd2);
		System.out.println("delete successfully");
		t.commit();
	}
			
}
