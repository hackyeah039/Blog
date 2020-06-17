package com.jhta.spring08.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.dao.MembersDao;
import test.service.MembersService;
import test.vo.MembersVo;

@Controller
public class ListController {
	private MembersService service;
	public void setService(MembersService service) {
		this.service = service;
	}
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		List<MembersVo> list=service.list();
		mv.addObject("list",list);
		mv.setViewName("listResult");
		return mv;
	}
}
