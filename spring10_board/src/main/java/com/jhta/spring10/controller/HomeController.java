package com.jhta.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jhta.spring10.service.BoardService;
import com.jhta.spring10.vo.BoardVo;

@Controller
public class HomeController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		List<BoardVo> list=service.recent();
		model.addAttribute("vo",list);
		return "home";
	}
	
}
