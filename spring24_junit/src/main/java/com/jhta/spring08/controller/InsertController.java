package com.jhta.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.service.MembersService;
import test.vo.MembersVo;

@Controller
public class InsertController {
	private MembersService service;
	public void setService(MembersService service) {
		this.service = service;
	}
	@RequestMapping("/insert")
	public String execute() {
		return "insert";
	}
	@RequestMapping("/insertOk")
	public ModelAndView insertOk(MembersVo vo) { //파라미터들어가는게 Vo안의 칼럼이름이랑 같아야지 자동으로 들어감
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result");
		int n=service.insert(vo);
		if(n>0) {
			mv.addObject("code","success");
		}else {
			mv.addObject("code", "fail");
		}
		return mv;
	}
}
