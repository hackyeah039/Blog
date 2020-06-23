package com.jhta.spring22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@GetMapping("/admin/memberlist")
	public String memberList() {
		return ".admin.memberlist";
	}
	@GetMapping("/admin/notice")
	public String notice() {
		return ".admin.notice";
	}
}
