package com.labActivity.dao;

public interface UserDetailsDao{

	       //fetch customer details from db table
			public void getUserDeatils();
			
			//saving new customer details into db table
			public void addUserDetails();
			
			//changing existing customer details from db table
			public void updateUserDetails();
			
			//remove existing customer details from db table
			public void deleteUserDetails();
}
