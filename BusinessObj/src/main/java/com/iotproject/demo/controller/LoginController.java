package com.iotproject.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class LoginController {

    @RequestMapping(value = "/hello")
    public void hello(){
       System.out.println("接收到请求 ，Hello");
       
    }

    @RequestMapping("/login")
    public String login(){
    	System.out.println("login...");
		String p = "10";
    	return p;  
    }
}
