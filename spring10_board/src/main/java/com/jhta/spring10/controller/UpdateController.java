package com.jhta.spring10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.spring10.service.BoardService;
import com.jhta.spring10.vo.BoardVo;

@Controller
public class UpdateController {

	@Autowired
	private BoardService service;
	
	@GetMapping("board/update")
	public String update(int num,Model model) {
		model.addAttribute("num",num);
		return "board/updateForm";
	}
	@PostMapping("board/real")
	public String real(BoardVo vo) {
		int n=service.update(vo);
		if(n!=0) {
			return "redirect:/list";
		}else {
			return "error";
		}
	}
}
