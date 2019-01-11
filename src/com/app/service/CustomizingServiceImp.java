package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomizingDao;
import com.app.pojos.Customizing;
@Service
@Transactional
public class CustomizingServiceImp implements CustomizingService{
   @Autowired
   private CustomizingDao dao;
	@Override
	public Integer request(Customizing cust) {
		
		return dao.request(cust);
	}

}
