package com.app.controllers;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.pojos.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/Login")
public class LoginController {
	@Autowired
	private CustomerService service;
	@Autowired
	private JavaMailSender sender;
	
	@RequestMapping("/log")
   	public String CustomerShowLogin(Customer c)
   	{   System.out.println("inside show login form");
   		return "login";
   	}
    @RequestMapping(value="/log",method=RequestMethod.POST)
   	public String CustomerProcessLogin(Customer c,Model map,HttpSession hs)
   	{   System.out.println("inside processing  login form");
   	     Customer cust=service.login(c.getEmail(), c.getPassword());
   	    
   	      if( cust!=null)
   	      {      System.out.println(cust.getRole()+" login method");
   	    	   if(cust.getRole().equals("user"))
   	    	   {   System.out.println(cust.getFirstName()+" login method");
   	    		   hs.setAttribute("firstname", cust.getFirstName());
   	    		   hs.setAttribute("customer", cust);
   	    	       return "redirect:/homepage/userhome";
   	    	   }
   	    	   else if(cust.getRole().equals("admin"))
   	    		{ System.out.println("inside");
   	    		   hs.setAttribute("firstname", cust.getFirstName());
   	    		   System.out.println(cust.getFirstName());
   	    		   return "redirect:/admin/adm";
   	    		 }
   	         }
   	      map.addAttribute("msg", "invalid user name or password?");
   		return "login";
   	}
    
    
    @RequestMapping("/forget")
   public String forgetPassWord(Customer c)
   {
	   return "forgetpassword";
   }
    @RequestMapping( value="/forget", method=RequestMethod.POST)
    public String forgetProcessPassWord(Customer c ,Model map)
    {   System.out.println(c.getEmail());
    	Customer st=service.forget(c.getEmail());
    	   if(st!=null)
    	   {
    		   SimpleMailMessage simple=new SimpleMailMessage();
    	    	
    		   simple.setTo("developervikas17@gmail.com");
    	    	
    		   simple.setText(st.getPassword());
    	    	
    		   sender.send(simple);
    		    map.addAttribute("status"," send your password on email!!");
    	    	
    		   return "login";
    		   
    	   }
    	
    	   else
    	   {
    		   return "forgetpassword" ;
    	   }
    }

}
