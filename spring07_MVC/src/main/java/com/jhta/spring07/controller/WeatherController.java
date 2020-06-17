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
			result="오늘의 날씨:더워요!~";
		}else if(day==2) {
			result="내일의 날씨: 더 더워요!";
		}
		ModelAndView mv= new ModelAndView();
		mv.addObject("result",result);
		mv.setViewName("showWeather");
		return mv;
	}
}
