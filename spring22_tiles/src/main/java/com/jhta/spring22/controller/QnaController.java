package com.jhta.spring22.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QnaController {
	
	@RequestMapping("/qna")
	public ModelAndView qna() {
		ModelAndView mv = new ModelAndView(".qna");
		ArrayList<String> list=new ArrayList<String>();
		list.add("문의1");
		list.add("문의2");
		list.add("문의3");
		list.add("문의4");
		mv.addObject("list",list);
		return mv;
	}
}
