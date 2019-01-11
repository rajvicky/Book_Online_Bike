package com.app.service;

import java.util.List;

import com.app.controllers.OrderController;
import com.app.pojos.AddressTable;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;

public interface OrderService {
	public String OrderBike(OrderDetail ord,AddressTable ad);
	public String OrderBikes(List<OrderDetail> ord,Order order,AddressTable ad);
}
