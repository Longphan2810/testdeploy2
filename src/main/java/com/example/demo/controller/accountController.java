package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class accountController {

	@Autowired
	HttpServletRequest request;
	
	@Autowired
	HttpServletResponse response;
	
	@Autowired
	ServletContext application;
	
	@GetMapping("/account")
	public String showform() {
		
		return "bai2/accUser";
	}
	
	
	@PostMapping("/SaveAccountCookie")
	@ResponseBody
	public String SaveAccount() {
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("User name :  " + username);
		System.out.println("password  :  " + pass);
		Cookie userCookie = new Cookie("user", username);
		userCookie.setMaxAge(60*60);
		response.addCookie(userCookie);
		return "Saved cookies";
	}
	
	
}
