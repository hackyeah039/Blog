package com.jhta.spring05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public ModelAndView fortune() {
		String result="동쪽으로 가면 귀인을 만난다.";
		ModelAndView mv=new ModelAndView(); //뷰 이름과 결과값
		mv.addObject("result",result);//결과가 많으면 쭉 담아라 
		mv.setViewName("showFortune");//1.이 뷰이름을 분석해서
		return mv;//1.D.S로 리턴
	}
}
