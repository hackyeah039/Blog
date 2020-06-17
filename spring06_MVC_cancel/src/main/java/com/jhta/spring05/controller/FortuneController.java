package com.jhta.spring05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FortuneController {
	@RequestMapping("/fortune")
	public ModelAndView fortune() {
		String result="�������� ���� ������ ������.";
		ModelAndView mv=new ModelAndView(); //�� �̸��� �����
		mv.addObject("result",result);//����� ������ �� ��ƶ� 
		mv.setViewName("showFortune");//1.�� ���̸��� �м��ؼ�
		return mv;//1.D.S�� ����
	}
}
