package com.jhta.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.page.util.PageUtil;
import com.jhta.test.DAO.GongiDAO;
import com.jhta.test.VO.Gongivo;
import com.jhta.test.service.GongiService;

@Controller
public class ListController {
	
	@Autowired
	private GongiService service;
	@RequestMapping("/")//
	public ModelAndView list(String keyword,String field,
			@RequestParam(value = "pageNum",defaultValue = "1")int pageNum) {
		ModelAndView mv = new ModelAndView("list");
		 HashMap<String, Object> map = new HashMap<String, Object>();
		 map.put("field", field);
		 map.put("keyword",keyword);
		 int totalRowCount=service.count(map);
		 PageUtil pu= new PageUtil(pageNum, totalRowCount, 5, 5);
		 map.put("startRow",pu.getStartRow());
		 map.put("endRow",pu.getEndRow());
		 List<Gongivo> list=service.list(map); 	
		 mv.addObject("field",field);
		 mv.addObject("keyword", keyword);
		 mv.addObject("pu", pu);
		 mv.addObject("list", list);
		return mv;
	}
}
