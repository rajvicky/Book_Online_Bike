package com.app.dao;

import com.app.pojos.Customer;

public interface CustomerDao {
	public String registration(Customer c);
	public Customer login(String email,String pass);
    public Customer forget(String email);

}
