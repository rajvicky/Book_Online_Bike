package com.app.service;

import java.util.List;

import com.app.pojos.BikeStore;
import com.app.pojos.Category;
import com.app.pojos.OrderDetail;

public interface AdminService 
{
 public List<String> category();
 public Integer postBike(BikeStore b);
 public List<OrderDetail> getallOrderDetail();
}
