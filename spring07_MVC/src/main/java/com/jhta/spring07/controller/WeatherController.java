package com.jhta.spring07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WeatherController {
	@RequestMapping("/weather")
	public ModelAndView weather(int day) {
		String result="";
		if(day==1) {
			result="������ ����:������!~";
		}else if(day==2) {
			result="������ ����: �� ������!";
		}
		ModelAndView mv= new ModelAndView();
		mv.addObject("result",result);
		mv.setViewName("showWeather");
		return mv;
	}
}
