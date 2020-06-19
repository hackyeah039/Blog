package com.jhta.spring20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.spring20.service.MembersService;
import com.jhta.spring20.service.MembersServiceImpl;
import com.jhta.spring20.vo.MembersVo;

@Controller
public class JoinController {
	
	@Autowired
	private MembersService service;
	
		
	@GetMapping("/member/join")
	public String joinForm() {
		return "insert";
	}
	@PostMapping("/member/join")
	public String joinOk(MembersVo vo) {
		try {
			service.insert(vo);
			return "success";
		}catch(Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
