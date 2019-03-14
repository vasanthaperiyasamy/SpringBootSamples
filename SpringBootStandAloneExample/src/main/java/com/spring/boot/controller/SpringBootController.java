package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	
	@RequestMapping("/")
     String home(ModelMap map) {
    	 
    	 map.addAttribute("title", "Dear Leaner");
    	 map.addAttribute("message", "Welcome to Spring Boot");
    	 
    	 return "hello";
     }
}
