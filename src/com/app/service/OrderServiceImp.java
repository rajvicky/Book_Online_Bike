package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.controllers.OrderController;
import com.app.dao.OrderDao;
import com.app.pojos.AddressTable;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;

@Service
@Transactional
public class OrderServiceImp implements OrderService 
{
   @Autowired
   private OrderDao dao;
	@Override
	public String OrderBike(OrderDetail ord,AddressTable ad) {
		
		return dao.OrderBike(ord,ad);
	}
	@Override
	public String OrderBikes(List<OrderDetail> ord,Order order,AddressTable ad) {
		// TODO Auto-generated method stub
		return dao.OrderBikes(ord,order,ad);
	}
	

}
