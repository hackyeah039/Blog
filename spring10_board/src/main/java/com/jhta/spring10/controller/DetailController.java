package com.jhta.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.spring10.service.BoardService;
import com.jhta.spring10.vo.BoardVo;

@Controller
public class DetailController {

	@Autowired
	private BoardService service;
	
	@RequestMapping("/board/detail")
	public String detail(int num,Model model) { //ModelAndView보다 이 방식을 많이 사용한다.
		System.out.println("넘어옴");
		service.addHit(num);//조회수 증가
		BoardVo vo=service.detail(num);//상세글정보
		BoardVo next=service.next(num);
		BoardVo prev=service.prev(num);
		model.addAttribute("vo",vo);
		model.addAttribute("next", next);
		model.addAttribute("prev", prev);
		return "board/detail";
	}
}
