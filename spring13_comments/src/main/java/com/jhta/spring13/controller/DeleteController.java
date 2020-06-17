package com.jhta.spring13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.spring13.Service.CommentsService;

@Controller
public class DeleteController {
	@Autowired
	private CommentsService service;
	
	@RequestMapping("/comments/delete")
	public String delete(int num) {
		System.out.println(num+"받은 넘버");
		int n=service.delete(num);
		if(n!=0) {
			return "home";
		}else {
			return "error";
		}
	}
}
