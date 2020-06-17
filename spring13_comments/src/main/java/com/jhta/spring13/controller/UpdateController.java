package com.jhta.spring13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jhta.spring13.Service.CommentsService;
import com.jhta.spring13.VO.CommentsVo;

@Controller
public class UpdateController {
	@Autowired
	private CommentsService service; 
	
	@GetMapping(value = "/comments/update",produces = "application/xml;charset=utf-8")
	public String update(int num,String id,String comments,Model model) {
		CommentsVo vo= new CommentsVo(num,1,id,comments);
		int n=service.update(vo);
		if(n!=0) {
			CommentsVo vo1=service.getinfo(num);
			model.addAttribute("fix","asd");
			model.addAttribute("writer",vo1.getId());
			model.addAttribute("content",vo1.getComments());
			return "home";
		}else {
			return "error";
		}
	}
}
