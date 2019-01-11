package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customizing;
@Repository
public class CustomizingDaoImp implements CustomizingDao{
  @Autowired
  private SessionFactory sf;
	@Override
	public Integer request(Customizing cust) {
		Integer id=(Integer)sf.getCurrentSession().save(cust);
		return id;
	}

}
