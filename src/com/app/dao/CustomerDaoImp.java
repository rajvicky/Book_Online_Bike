package com.app.dao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;
@Repository
public class CustomerDaoImp implements CustomerDao
{
 @Autowired
  private SessionFactory sf;
	@Override
	public String registration(Customer c) 
		{  String key=""; 
		  if(c!=null)
		   {
			 String st="select c from Customer c where c.email=:em";
			 Customer cust=(Customer)sf.getCurrentSession().createQuery(st).setParameter("em", c.getEmail()).uniqueResult();
			   if(cust==null)
			   {
				 Integer id=(Integer)sf.getCurrentSession().save(c);
				   if(id!=null)
				  key="Successfully !!"+c.getFirstName();
				   else
				  key="not register !";
			   }
			   else
		      {key="Email Id already exist !!";}
		   }
		else
		{
			key="not register";
		}
		  return key;
	  }
	
	
	@Override
	public Customer login(String email, String pass) {
	      String st="select c from Customer c where c.email=:em and c.password=:ps";
	      Object obj=sf.getCurrentSession().createQuery(st).setParameter("em", email).setParameter("ps",pass).uniqueResult();
	      if(obj!=null)
	      {
	       Customer c=(Customer)obj;
	       System.out.println(c.getFirstName());
	       if(c!=null)
			   {
		    	   return c;
			   }
	      
	      }
	     return null;
	   }
	
	
	@Override
	public Customer forget(String email)
	   {   System.out.println(email);
	        String stl="select c from Customer c  where c.email=:em"; 
	        Object obj=sf.getCurrentSession().createQuery(stl).setParameter("em", email).uniqueResult();
	         System.out.println(obj.toString()); 
	        if(obj!=null)
		      {
		       Customer c=(Customer)obj;
		       System.out.println(c.getFirstName());
		       if(c!=null)
					   {
				    	   return c;
					   }
		      }
		     return null;
	   }

}
