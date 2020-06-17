package com.jhta.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.service.MembersService;

@Controller
public class DeleteController {
	private MembersService service;
	
	public void setService(MembersService service) {
		this.service = service;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(int num) {
		int result=service.delete(num);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result",result);
		mv.setViewName("DeleteResult");
		return mv;
	}
}
