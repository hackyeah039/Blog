package com.jhta.spring09.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String gotoHome() {
		return "main";
	}
}
