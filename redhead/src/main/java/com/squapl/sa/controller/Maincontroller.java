package com.squapl.sa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {

	
	@RequestMapping("/welcome")
	public String mainpage(Model model){
		
		
		return "welcomepage";
	}
}
