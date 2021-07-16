package com.fis.webapp.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fis.webapp.service.EmailService;
import com.fis.webapp.service.MathService;

@Controller
public class MyFirstController {

	@Autowired
	EmailService emailex;
	public MyFirstController() {
		super();
		System.out.println("Inside Web Controller - default constructor called ");
	}
	
	@RequestMapping("/")
	public String showHomePage()
	{
		return "homepage";
	}

	// ------------          request from client (done by post method)
	@RequestMapping(value = "/doEmailAction",method = RequestMethod.POST)
	public String doThings(HttpServletRequest req,Model model, String email)
	{
		
		String email1 = req.getParameter("email");
		emailex.setName(email1);
		
		
		String username= emailex.getUsername();
		String domainname= emailex.getDomain();
		
		System.out.println(" ---->> username "+username);
		System.out.println(" ---->> domainname "+domainname);
		
		model.addAttribute("username", username);
		model.addAttribute("domainname",domainname);
		
		
		return "displayPage"; // response from Server
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
