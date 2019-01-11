package com.app.controllers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.BikeStore;
import com.app.service.HomeBikeService;
@Controller
@RequestMapping("/homepage")
public class HomeBikeController 
{    
	@Autowired
	private HomeBikeService service;
     	
	public HomeBikeController() {

	System.out.println("inside home");
	}
	
	
	@RequestMapping("/home")
	public String getAllBike(HttpSession hs)
	{ 
		 List<BikeStore> li;
		 li=service.getAllBike();
		 if(li!=null)
		 {
			
			 hs.setAttribute("li", li);
			  System.out.println(li.toString());
			
			 return "Homepage"; 	 
		 }
		 
        return "redirect:/customer/reg";
	}
	
	@RequestMapping("/userhome")
	public String getAllBikes(HttpSession hs)
	{ 
		 List<BikeStore> li;
		 li=service.getAllBike();
		 if(li!=null)
		 {
			
			 hs.setAttribute("li", li);
			  System.out.println(li.toString());
			
			 return "userhomepage"; 	 
		 }
		 
        return "redirect:/customer/reg";
	}
	
	
	

	@RequestMapping("/product")
	public String productDetails(@RequestParam("idparam") String idparam,HttpSession ht)
	{     
		System.out.println("inside show product details");
		
		
		BikeStore bike=service.getDetailsOfBike(Integer.parseInt(idparam));
	     //System.out.println(bike.toString());
		ht.setAttribute("bike", bike);	
		return "ProductDetail";
	}
	
	
	
}
