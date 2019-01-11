package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.AddressTable;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;
@Repository
public class OrderDaoImp implements OrderDao {
	@Autowired
	private SessionFactory sf;
	@Override
	public String OrderBike(OrderDetail ord,AddressTable ad) {
		 sf.getCurrentSession().save(ad);
		 System.out.println("inside of order dao implement");
		 System.out.println(ord.toString());
		sf.getCurrentSession().save(ord.getOrder());
		 //ord.getOrder().addOrderDetail(ord);
	  Integer status=(Integer)sf.getCurrentSession().save(ord);
		
		return "true";
	}
	@Override
	public String OrderBikes(List<OrderDetail> ord,Order order,AddressTable ad) {
		 sf.getCurrentSession().save(ad);
		 sf.getCurrentSession().save(order);
		for (OrderDetail orderDetail : ord) {
			sf.getCurrentSession().save(orderDetail);
		}
		return null;
	}

}
