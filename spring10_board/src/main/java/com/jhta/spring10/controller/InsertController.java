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
public class InsertController {
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public String gotoinsert() {
		return "board/insert";
	}
	
	@RequestMapping(value = "board/insert",method = RequestMethod.POST)
	public String realinsert(BoardVo vo,Model model) {
		int n=service.insert(vo);
		if(n!=0) {
			List<BoardVo> list=service.recent();
			model.addAttribute("vo",list);
			return "home";
		}else {
			return "board/insert";
		}
		
	}
}
