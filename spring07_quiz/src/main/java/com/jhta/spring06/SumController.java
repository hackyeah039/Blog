package com.jhta.spring06;

import org.omg.CORBA.Request; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SumController {

	@RequestMapping("/sum")
	public ModelAndView sum(int num1,int num2) {
		ModelAndView mv = new ModelAndView();
		int result=num1+num2;
		mv.addObject("result",result);
		mv.setViewName("showResult");
		return mv;
	}
}
