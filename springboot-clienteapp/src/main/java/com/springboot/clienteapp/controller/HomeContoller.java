package com.springboot.clienteapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {

	@GetMapping({"home", "/"})
	public String index() {
		return"home";
		
	}
	
	
	
	
}
