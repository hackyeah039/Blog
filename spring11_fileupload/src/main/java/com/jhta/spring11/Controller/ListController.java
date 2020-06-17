package com.jhta.spring11.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jhta.page.util.PageUtil;
import com.jhta.spring11.service.FileinfoService;
import com.jhta.spring11.vo.FileinfoVo;

@Controller
public class ListController {

	@Autowired
	private FileinfoService service;
	
	@RequestMapping("file/list")
	public ModelAndView list(Model model,String field,String keyword,@RequestParam(value = "pageNum",defaultValue = "1")int pageNum) {
		ModelAndView mv = new ModelAndView("list2");
		System.out.println(field +"필드값");
		System.out.println(keyword +"키워드값");
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("field",field);
		map.put("keyword",keyword);
		System.out.println("countㅓㅈㄴ");
		int totalcount=service.count(map);
		System.out.println(totalcount+" totalcount!!");
		
		System.out.println(pageNum+"pageNUM!!");
		PageUtil pu = new PageUtil(pageNum,totalcount,5,10);
		map.put("startRow",pu.getStartRow());
		map.put("endRow",pu.getEndRow());
		List<FileinfoVo> list=service.list(map);
		model.addAttribute("list",list);
		model.addAttribute("pu",pu);
		model.addAttribute("keyword",keyword);
		model.addAttribute("field",field);
		return mv;
	}
	
}
