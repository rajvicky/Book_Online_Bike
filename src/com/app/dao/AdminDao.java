package com.app.dao;

import java.util.List;

import com.app.pojos.BikeStore;
import com.app.pojos.Category;
import com.app.pojos.OrderDetail;

public interface AdminDao 
{
 public Integer postBike(BikeStore b);
 public List<String> category();
 public List<OrderDetail> getallOrderDetail();

}
