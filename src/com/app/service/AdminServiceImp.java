package com.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AdminDao;
import com.app.pojos.BikeStore;
import com.app.pojos.Category;
import com.app.pojos.OrderDetail;
@Service
@Transactional
public class AdminServiceImp implements AdminService
{
   @Autowired
   private AdminDao dao;
	@Override
	public Integer postBike(BikeStore b) {
		// TODO Auto-generated method stub
		return dao.postBike(b);
	}

	@Override
	public List<String> category() {
	
		return dao.category();
	}

	@Override
	public List<OrderDetail> getallOrderDetail() {
		
		return dao.getallOrderDetail();
	}

}
