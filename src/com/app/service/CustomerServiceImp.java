package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.dao.CustomerDao;
import com.app.pojos.Customer;
@Service
@Transactional
public class CustomerServiceImp implements CustomerService {
     @Autowired
     private CustomerDao dao;
	@Override
	public String registration(Customer c)
	{
	     
		return dao.registration(c);
	}
	@Override
	public Customer login(String email, String pass) {
		
		return dao.login(email, pass);
	}
	@Override
	public Customer forget(String email) {
		
		return dao.forget(email);
	}
	

}
