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
	public String detail(int num,Model model) { //ModelAndView���� �� ����� ���� ����Ѵ�.
		System.out.println("�Ѿ��");
		service.addHit(num);//��ȸ�� ����
		BoardVo vo=service.detail(num);//�󼼱�����
		BoardVo next=service.next(num);
		BoardVo prev=service.prev(num);
		model.addAttribute("vo",vo);
		model.addAttribute("next", next);
		model.addAttribute("prev", prev);
		return "board/detail";
	}
}
