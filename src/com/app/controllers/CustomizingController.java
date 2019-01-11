package com.app.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.BikeStore;
import com.app.pojos.Customer;
import com.app.pojos.Customizing;
import com.app.service.CustomizingService;
import com.app.service.HomeBikeService;

@Controller
@RequestMapping("/custcontroller")
public class CustomizingController {
	@Autowired
	private CustomizingService service;
	@Autowired
	private HomeBikeService bikeservice;
	@RequestMapping(value="/beforecust")
	public String customizingmethodform(@RequestParam("idparam") String idparam,HttpSession hs)
	{   
		System.out.println(idparam);
		BikeStore bike=bikeservice.getDetailsOfBike(Integer.parseInt(idparam));
		System.out.println(bike.toString());
		hs.setAttribute("customiz", bike);
		return "customizingform";
	}
	@RequestMapping(value="/aftercust")
	public String customizingmethod(Customizing custom,HttpSession hs) 
	{   System.out.println("inside customizing method");
		  Customer customer=(Customer)hs.getAttribute("customer");
		  BikeStore bike=(BikeStore)hs.getAttribute("customiz");
		   custom.setBikeStore(bike);
		   custom.setCustomer(customer);
		System.out.println(custom.toString());
		 service.request(custom);
		return "customizingform";
	}

}
