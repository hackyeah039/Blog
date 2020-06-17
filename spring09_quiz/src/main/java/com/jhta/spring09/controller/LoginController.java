package com.jhta.spring09.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.service.MyUsersService;
import test.vo.MyUsersVo;

@Controller
public class LoginController {
	@Autowired
	private MyUsersService service;
	
	@RequestMapping(method = RequestMethod.GET, value="/login")
	public String goToLogin() {
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST  ,value="/realLog")
	public String dividing(String id,String pwd,HttpSession session) {
		
		MyUsersVo vo=service.getinfo(id);
		if(vo==null) {
			session.setAttribute("id", id);
			session.setAttribute("pwd", pwd);
		}
			return "redirect:/";
	}
}
