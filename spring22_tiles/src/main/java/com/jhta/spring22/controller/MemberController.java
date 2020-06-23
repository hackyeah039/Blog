package com.jhta.spring22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	@GetMapping("/member/mypage")
	public String memberList() {
		return ".member.mypage";
	}
	
	@GetMapping("/member/cart")
	public String cart() {
		return ".member.cart";
	} 
	
	@GetMapping("/member/board1")
	public String board1() {
		return ".member.board.board1";
	}
	@GetMapping("/member/board2")
	public String board2() {
		return ".member.board.board2";
	}
}
