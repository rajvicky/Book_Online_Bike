package com.app.controllers;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Customer;
import com.app.service.CustomerService;
@Controller
@RequestMapping("/customer")
public class CustomerController
{   @Autowired
	private CustomerService service;
    @RequestMapping("/reg")
	public String CustomerShowRegistration(Customer c)
	{   System.out.println("inside show  registration form");
		return "registration";
	}
    @RequestMapping(value ="/reg",method=RequestMethod.POST)
	public String CustomerProcessRegistration(Customer c,RedirectAttributes rs)
	{   System.out.println("inside process  registration form");
	    LocalDate dt=LocalDate.now();
	       c.setRegistrationDate(Date.valueOf(dt));
	         rs.addFlashAttribute("msg", service.registration(c));
	       System.out.println(Date.valueOf(dt));
		return "redirect:/Login/log";
	}
    
}
