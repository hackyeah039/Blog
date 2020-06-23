package com.jhta.spring22.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemsController {
	@RequestMapping("/items")
	public String items(Model model) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("�ٳ���");
		list.add("����");
		model.addAttribute("list",list);
		return ".items";
	}
}
