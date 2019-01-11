package com.app.service;

import com.app.pojos.Customer;

public interface CustomerService 
{
	public String registration(Customer c);
	public Customer login(String email,String pass);
	public Customer forget(String email);
	
	
	
}
