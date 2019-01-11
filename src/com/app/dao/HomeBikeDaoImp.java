package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.BikeStore;
import com.app.pojos.Category;
@Repository
public class HomeBikeDaoImp  implements HomeBikeDao
{
	@Autowired
	private SessionFactory sf;
	@SuppressWarnings("unchecked")
	@Override
	public List<BikeStore> getAllBike() 
	 {  Category ct=new Category();
	    List<BikeStore> li;
		 String stl="select  b from BikeStore b";
		 li=sf.getCurrentSession().createQuery(stl).list();
		 System.out.println(li);
		  if(li!=null)
		   { 
			  return li;
		  }
		  
		else 
		{	
			  return null;
	   }
	}
	
	
	
	
	@Override
	 public BikeStore getDetailsOfBike(int id) {
		 System.out.println(id); 
	   String  sql="select bike from BikeStore bike where bike.bikeId=:id";
	    
	   Object obj=sf.getCurrentSession().createQuery(sql).setParameter("id", id).uniqueResult();
	     if(obj!=null)
	     {
	    	 BikeStore bike=(BikeStore)obj;
	    	
	    	 return bike;
	         
	     }
	     
	     return null;
	}

}
