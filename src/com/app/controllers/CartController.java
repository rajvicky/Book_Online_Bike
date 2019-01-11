package com.app.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.xml.soap.Detail;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.BikeStore;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;
@Controller
@RequestMapping("/cart")
   public class CartController {
	   private static BikeStore bike=new BikeStore();
	   private static  Map<Integer, BikeStore> map=new HashMap<Integer, BikeStore>(); 
	    private static Integer items=0;
	   static List<OrderDetail> orderlist=new ArrayList<OrderDetail>();
	   
	   public CartController() {
		
		   System.out.println("inside cart ");
		   bike.setOrderDetails(orderlist);   
	   }
    @SuppressWarnings("unchecked")
    @RequestMapping(value="/addcart")
    public String addCart( OrderDetail ord,HttpSession hs)
	  {  
     System.out.println("inside add to cart"); 
     BikeStore bst=(BikeStore)hs.getAttribute("bike");
 	 //OrderDetail ord=new OrderDetail();
     if(!map.isEmpty())
			    	 { 
    	 boolean status=false;
    	          System.out.println("--------------------------------------map is not empty----------");
    	 
			    	  map=(HashMap<Integer, BikeStore>)hs.getAttribute("CartContains");
			          map.put(bst.getBikeId(), bst);
			          hs.setAttribute("CartContains", map); 
			         // hs.setAttribute("sizeOfMap",map.size());
			          System.out.println(map);
			         items=0;
			          orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
			          
						          for (OrderDetail orderDetail : orderlist) 
						          {   
						                    System.out.println("--------------------------------inside for--------");
						                  //  System.out.println(orderDetail.getBikeStore().getBikeId());
								        	 if (orderDetail.getBikeStore().getBikeId()==bst.getBikeId())
								        	{  
								        		
								        		status=true;
								        	    orderDetail.setQty(orderDetail.getQty()+1);
								        		orderDetail.setPrice(orderDetail.getUnitPrice()*orderDetail.getQty());
								        		System.out.println(orderDetail.toString());
								        		break;
								        		
								        	}
											
								}
				     
						          if(status==false)
						          {
						        	  
						        	  System.out.println("inside map for loop else ");
						        	  ord.setBikeStore(bst);
							          ord.setUnitPrice(bst.getPrice());
							          ord.setQty(1);
							          ord.setPrice(bst.getPrice()*ord.getQty());
							          bike.addOrderDetail(ord);
							          hs.setAttribute("orderlistcart", bike.getOrderDetails());
						        	  
						        	  
						          }
						          for (OrderDetail orderDetail : orderlist) 
						          {   
						            items=items+orderDetail.getQty();
						          }
						          
						   hs.setAttribute("sizeOfMap",items);
			       } 
     
 			      else
				      {
				    	  map.put(bst.getBikeId(), bst);   
				    	  items=1;
				          hs.setAttribute("CartContains", map);
				          hs.setAttribute("sizeOfMap", items);
				          ord.setBikeStore(bst);
				          ord.setUnitPrice(bst.getPrice());
				          ord.setQty(1);
				          ord.setPrice(bst.getPrice()*ord.getQty());
				          bike.addOrderDetail(ord);
				          //System.out.println(ord.getBikeStore());
				          //System.out.println("else inside");
				          
				          hs.setAttribute("orderlistcart", bike.getOrderDetails());
				     
				      }
           System.out.println(ord.toString());
            return "redirect:/homepage/userhome";

	}
    @RequestMapping(value="/order")
    public String order(HttpSession hs)
    {
    	 BikeStore bst=(BikeStore)hs.getAttribute("bike");
    	 OrderDetail ord=new OrderDetail();
    	 ord.setBikeStore(bst);
         ord.setUnitPrice(bst.getPrice());
         ord.setQty(1);
         ord.setPrice(bst.getPrice()*ord.getQty());
    	 
    	return "orderpage";
    }
	
    @RequestMapping(value="/showcart")
    public String showCartDetails(OrderDetail ord ,HttpSession hs)
	  { 
    	
    	orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
    	
    	float total=0;
    	  for (OrderDetail orderDetail : orderlist) {
			      total=total+orderDetail.getPrice();
		}
    	  
    	  hs.setAttribute("total_amount",total);
    	
    	return "addcartpage";
    	
	  }
    
    @RequestMapping(value="/updatecart", method=RequestMethod.POST)
    public String upadateCartDetail(@RequestParam("idparam") int idparam, OrderDetail ord,HttpSession hs)
    {   
    	
    	  orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
    	  
    	  for (OrderDetail orderDetail : orderlist) 
          {   
                    System.out.println("--------------------------------inside for--------");
                  //  System.out.println(orderDetail.getBikeStore().getBikeId());
		        	 if (orderDetail.getBikeStore().getBikeId()==idparam)
		        	{  
		        	
		        	    orderDetail.setQty(ord.getQty());
		        		orderDetail.setPrice(orderDetail.getUnitPrice()*orderDetail.getQty());
		        		System.out.println(orderDetail.toString());
		        		break;
		        		
		        	}
					
		}
    	  float total=0;
    	  for (OrderDetail orderDetail : orderlist) {
		      total=total+orderDetail.getPrice();
	}
	  
	  hs.setAttribute("total_amount",total);
	  
	  
	  
	  
	  items=0;
		for (OrderDetail orderDetail : orderlist) 
	    {   
	      items=items+orderDetail.getQty();
	    }
	    
	hs.setAttribute("sizeOfMap",items);
	  
	  
	  
	  
	  
	  
    	  
    	return "addcartpage";
    }
    
    @RequestMapping(value="/order", method=RequestMethod.POST)
    public String order( OrderDetail ord,HttpSession hs)
    {   
    	BikeStore bst=(BikeStore)hs.getAttribute("bike");
   	    ord.setBikeStore(bst);
        ord.setUnitPrice(bst.getPrice());
        ord.setQty(1);
        ord.setPrice(bst.getPrice()*ord.getQty());
    	System.out.println("inside order method");
       System.out.println(ord.toString());
    	return "orderpage";
    }
    
    @RequestMapping(value="/remove")
    public String remove(@RequestParam("idparam") int idparam,HttpSession hs)
    {   
    	
    	 orderlist=(ArrayList<OrderDetail>)hs.getAttribute("orderlistcart");
    	 for (OrderDetail orderDetail : orderlist) {
			if(orderDetail.getBikeStore().getBikeId()==idparam)
			{  orderlist.remove(orderDetail);
				break;
			}
		}
    	 

   	  float total=0;
   	  for (OrderDetail orderDetail : orderlist) {
		      total=total+orderDetail.getPrice();
	}
   	  
   	for (OrderDetail orderDetail : orderlist) 
    {   
      items=items+orderDetail.getQty();
    }
    
hs.setAttribute("sizeOfMap",items);
   	  
	  
	  hs.setAttribute("total_amount",total);
    	 
    	 
    	 return "addcartpage";
    	
    }
    
    
    
}
