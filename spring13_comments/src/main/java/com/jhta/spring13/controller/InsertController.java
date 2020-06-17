package com.jhta.spring13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.spring13.Service.CommentsService;
import com.jhta.spring13.VO.CommentsVo;

@Controller
public class InsertController {

	@Autowired
	private CommentsService service;
	
	@RequestMapping("/comments/insert")
	public String insert(Model model,int mnum,String id,String comments) {
		CommentsVo vo = new CommentsVo(0, mnum, id, comments);
		int n=service.insert(vo);
		if(n!=0) {
			return "home";
		}else {
			return "error";
		}
	}
}
