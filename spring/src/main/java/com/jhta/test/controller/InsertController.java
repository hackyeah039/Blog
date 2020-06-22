package com.jhta.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jhta.test.DAO.GongiDAO;
import com.jhta.test.VO.Gongivo;

@Controller
public class InsertController {
	@Autowired
	private GongiDAO dao;
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	@PostMapping("/insert2")
	public String insert(Gongivo vo) {
		int n=dao.insert(vo);
		if(n!=0) {
			return "redirect:/";// Ȩ���� ���ư���
		}else {
			return "insert";
		}
	}
}
