package com.jhta.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.test.service.GongiService;

@Controller
public class DeleteController {
	
	@Autowired
	private GongiService service;
	
	@RequestMapping("/delete")
	public String delete(int num) {
		
		 int n=service.delete(num);
		 if(n!=0) {
			 return "redirect:/";
		 }else {
			 return "error";
		 }
	}
}
