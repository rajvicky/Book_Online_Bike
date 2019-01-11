package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.BikeStore;
import com.app.pojos.Category;
import com.app.pojos.OrderDetail;
@Repository
public class AdminDaoImp implements AdminDao
{   @Autowired
	private SessionFactory sf;
	@Override	
	public Integer postBike(BikeStore b) 
	{    
		 System.out.println(b.getCategory().getBikeName());
		 
		 String hql="select c from Category c where c.bikeName=:b1";
		 
		 Object obj=sf.getCurrentSession().createQuery(hql).setParameter("b1",b.getCategory().getBikeName()).uniqueResult();
		 
		 System.out.println(obj);
		 
		 Category ct=(Category)obj;
		 
		 ct.addBikeStore(b);
		 
		 b.setCategory(ct);
        
		Integer id=(Integer)sf.getCurrentSession().save(b);
		
		  if(id!=0)
		  {
		 return id;
		  }
		  else 
		  {
			  return null;
		  }
	}
	@Override
	public List<String> category() {
		  String st="select c.bikeName from Category c";
		    System.out.println("inside dao");
		   List<String> li;
		   li=sf.getCurrentSession().createQuery(st).list();
		    
		return li;
	}
	@Override
	public List<OrderDetail> getallOrderDetail() {
		List<OrderDetail> list;
		String sql="select order from OrderDetail order";
		list=(List<OrderDetail>)sf.getCurrentSession().createQuery(sql).list();
		
		return list;
	}

}
