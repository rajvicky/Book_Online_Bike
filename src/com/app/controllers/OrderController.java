package com.app.controllers;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.AddressTable;
import com.app.pojos.BikeStore;
import com.app.pojos.Customer;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;
import com.app.service.HomeBikeService;
import com.app.service.OrderService;
@Controller
@RequestMapping("/OrderController")
public class OrderController {
	@Autowired
	private OrderService service;
	@Autowired
	private HomeBikeService bikeservice;
	
   public OrderController() {
		System.out.println("inside order controler");
	}
	
   
   @RequestMapping("/bike")
	public String productDetail(@RequestParam("idparam") String idparam,HttpSession ht)
	{     
		System.out.println("inside show product details");
		
		
		BikeStore bike=bikeservice.getDetailsOfBike(Integer.parseInt(idparam));
	     //System.out.println(bike.toString());
		System.out.println(bike.toString());
	   	 OrderDetail ord=new OrderDetail();
	   	 ord.setBikeStore(bike);
	        ord.setUnitPrice(bike.getPrice());
	        ord.setQty(1);
	        ord.setPrice(bike.getPrice()*ord.getQty());
		ht.setAttribute("serachbike", bike);	
		return "orderpage";
	}
	
  /* 
   @RequestMapping(value="/booking")
   public String order(HttpSession hs)
   {  
   BikeStore bike=(BikeStore)hs.getAttribute("serachbike");
     System.out.println(bike);
   	
   	 
   	 
   	return "orderpage";
   }*/
	@RequestMapping(value="/order", method=RequestMethod.POST)
    public String order(AddressTable ad, OrderDetail ord,HttpSession hs)
   {   
    	BikeStore bst=(BikeStore)hs.getAttribute("serachbike");
  	    ord.setBikeStore(bst);
       ord.setUnitPrice(bst.getPrice());
       ord.setQty(1);
       ord.setPrice(bst.getPrice()*ord.getQty());    
       System.out.println("inside order method");
        System.out.println(ord.toString());

      LocalDate dt=LocalDate.now();
      Order order=new Order();
      ord.setOrder(order);
      ord.getOrder().setAmount(ord.getPrice());
      ord.getOrder().setOrderDate(Date.valueOf(dt));
      hs.setAttribute("order", order);
      hs.setAttribute("ord", ord);
      //service.OrderBike(ord);
    	return "shoppingaddress";
    }
	@RequestMapping(value="/directbooking")
	 public String ShippingAddress( AddressTable ad,HttpSession hs)
	    {  
	      Order order=(Order)hs.getAttribute("order");
	      Customer cust=(Customer)hs.getAttribute("customer");
	       hs.setAttribute("address", ad);
	     if(cust==null)
	    	 {return "redirect:/Login/log";}
	     else
	     {
	    	 order.setCustomer(cust);
		      ad.setCustomer(cust);
		      System.out.println(cust.toString());
		      OrderDetail ord=(OrderDetail)hs.getAttribute("ord");
		      
		      service.OrderBike(ord,ad);
			
			//return "redirect:/homepage/userhome";
			return "invoice";
	     }
		
	    }
	
	@RequestMapping(value="/check")
    public String checkOut(AddressTable ad,HttpSession hs)
    {   
		 /* List<OrderDetail> orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
	       LocalDate dt=LocalDate.now();
	       Order order=new Order();
	        order.setAmount((float)hs.getAttribute("total_amount"));
	        order.setOrderDate(Date.valueOf(dt));
	       //service.OrderBike(ord);
	       for (OrderDetail orderDetail : orderlist) {
	    	   orderDetail.setOrder(order);	
	    	   
		     }
	       for (OrderDetail orderDetail : orderlist) {
			System.out.println(orderDetail.toString());
		}
	     
	   service.OrderBikes(orderlist,order);*/
    	return "checkout";
    }
	@RequestMapping(value="/orderdone",method=RequestMethod.POST)
    public String Shipping( AddressTable ad,HttpSession hs)
    {    System.out.println(ad.toString());
        Customer cust=(Customer)hs.getAttribute("customer");
         System.out.println(cust.toString());
		List<OrderDetail> orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
	       LocalDate dt=LocalDate.now();
	       Order order=new Order();
	         ad.setCustomer(cust);
	         order.setCustomer(cust);
	        order.setAmount((float)hs.getAttribute("total_amount"));
	        order.setOrderDate(Date.valueOf(dt));
	       //service.OrderBike(ord);
	       for (OrderDetail orderDetail : orderlist) {
	    	   orderDetail.setOrder(order);	
	    	   
		     }
	       for (OrderDetail orderDetail : orderlist) {
			System.out.println(orderDetail.toString());
		}
	     System.out.println(ad.toString());
	   service.OrderBikes(orderlist,order,ad);
	   return "";
    }
	
	
	
	
	
}
