package com.jpa.dao;

public interface CustomerDao {

	//fetch customer details from db table
	public void getCustomerBy();
	
	//saving new customer details into db table
	public void addCustomer();
	
	//changing existing customer details from db table
	public void updateCustomer();
	
	//remove existing customer details from db table
	public void deleteCustomer();
}
