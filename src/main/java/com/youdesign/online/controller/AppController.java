package com.youdesign.online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public void registerUser(){
		
	}
	
	@RequestMapping(value = "placeorder", method = RequestMethod.POST)
	public void placeOrder(){
		
	}
	
	public void getOrderStatus(){
		
	}
	
	
	
}
