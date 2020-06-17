package com.jhta.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import test.service.MembersService;
import test.vo.MembersVo;
@Controller
public class UpdateController {
	private MembersService service;
	
	public void setService(MembersService service) {
		this.service = service;
	}
	@RequestMapping("/realUpdate")
	public ModelAndView realUpdate(MembersVo vo) {
		ModelAndView mv = new ModelAndView();
		if(vo==null) {
			mv.setViewName("update");
			return mv;
		}else {
			int result=service.update(vo);
			mv.addObject("result", result);
			mv.setViewName("updateResult");
			return mv;
		}
	}
	@RequestMapping("/update")
	public ModelAndView update(int num) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("num",num);
		mv.setViewName("update");
		return mv;
	}
}
