package com.app.controllers;
import java.io.File;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.BikeStore;
import com.app.pojos.Category;
import com.app.pojos.Order;
import com.app.pojos.OrderDetail;
import com.app.service.AdminService;
@Controller
@RequestMapping("/admin")
public class AdminController {
	 @Autowired
	 private AdminService  service;
	@RequestMapping("/adm")
	public String adminForm(BikeStore b,HttpSession hs) 
	{
		List<String> li=service.category();
		 System.out.println(li);
		 if(li!=null)
		 {
			
			 hs.setAttribute("list",li);
	     return "adminhomepage";
		 }
		return null;
		
	}
	@RequestMapping( value="/adm", method=RequestMethod.POST)
	public String adminSubmitBike(BikeStore b,BindingResult rs,HttpSession hs,@RequestParam MultipartFile image) 
	{   
		System.out.println(b.getCategory().getBikeName());
		System.out.println(rs);
		MultipartFile file = image;
		System.out.println(file.getOriginalFilename());
	      b.setImage(file.getOriginalFilename());
		if(file!=null && file.getSize() > 0) {
			try {
				InputStream in = file.getInputStream();
				String path = this.getClass().getResource("/../../uploads/").getPath();
				System.out.println("PATH : " + path);
				System.out.println("found ");
				if(path==null)
					throw new RuntimeException("getRealPath() failed.");
				else
					path+=file.getOriginalFilename();
				File uploadPath = new File(path);
				if(uploadPath.exists())
					uploadPath.delete();
				if(uploadPath.createNewFile()) {
					FileUtils.copyInputStreamToFile(in, uploadPath);	
				} 
				
			   } 
			
			catch(RuntimeException rtex){
				hs.setAttribute("status", rtex.toString());
			} catch(Exception ex){
				hs.setAttribute("status", ex.toString());
			}				
			hs.setAttribute("info", file);
		   }
		else 
		{
			hs.setAttribute("status", "failed");
		}
	Integer id=service.postBike(b);
	
	 if(id!=null)
	 {
		return "adminhomepage";
	 }
	 else
	 { 
		 hs.setAttribute("msg", " Bike is not insert in database !!");
		 return "adminhomepage";
	 }
		
	}
	@RequestMapping(value="/invoice")
	public String adminInvoice(HttpSession hs) 
	{  List<OrderDetail> list;
	   OrderDetail ord=new OrderDetail();
	     Order order=new Order();
		list=service.getallOrderDetail();
         order.setOrderDetails(list);
//         for (OrderDetail orderDetail : order.getOrderDetails()) {
//        	  System.out.println(orderDetail.toString());
//			
//		}
		return "invoice";
		
	}
	

}
