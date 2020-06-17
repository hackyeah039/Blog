package com.jhta.spring13.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhta.page.util.PageUtil;
import com.jhta.spring13.Service.CommentsService;
import com.jhta.spring13.VO.CommentsListVO;
import com.jhta.spring13.VO.CommentsVo;

@Controller
public class CommentsController {
	@Autowired
	private CommentsService service;
	
	@RequestMapping("/comments/list")
	@ResponseBody
	public CommentsListVO getList(@RequestParam(value = "pageNum", defaultValue = "1")int pageNum,int mnum) {
		int count=service.count(mnum);
		PageUtil pu=new PageUtil(pageNum,count, 5, 5);
		HashMap<String,Object> map=new HashMap<String, Object>();
		map.put("startRow",pu.getStartRow());
		map.put("endRow",pu.getEndRow());
		map.put("mnum",mnum);
		List<CommentsVo> list=service.list(map);	
		CommentsListVO comm=new CommentsListVO();
		comm.setList(list);
		comm.setStartPageNum(pu.getStartPageNum());
		comm.setEndPageNum(pu.getEndPageNum());
		comm.setPageCount(pu.getTotalPageCount());
		comm.setMnum(mnum);
		return comm;
	}
}
