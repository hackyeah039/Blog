package com.jhta.spring13.controller;

import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jhta.spring13.Service.CommentsService;
import com.jhta.spring13.VO.CommentsVo;
import com.jhta.spring13.VO.MembersVo;

@Controller
public class JSONController {
	@Autowired
	private CommentsService  service;
	@RequestMapping(value = "/comments/json/{value}",produces = "application/json;charset=utf-8")
	@ResponseBody
	public String json(@PathVariable("value")String value) {
		List<MembersVo> list2=service.checkaddr(value);
		JSONArray jarr = new JSONArray();
		//if(list2==null) {
		//	return "{'code':'fail'}"; 
		//}else {
			if(list2.size()==0) return jarr.toString();
			for(MembersVo vo:list2) {
				JSONObject json= new JSONObject();
				json.put("mnum",vo.getM_num());
				json.put("mname", vo.getM_name());
				json.put("memail", vo.getM_email());
				json.put("mphone", vo.getM_phone());
				json.put("maddr", vo.getM_addr());
				json.put("mreg", vo.getM_regdate());
				jarr.put(json);
			}
			return jarr.toString();
		
	}
	@RequestMapping(value = "/comments/json2/{value}",produces = "application/json;charset=utf-8")
	@ResponseBody
	public List<MembersVo> json2(@PathVariable("value")String value) {
		List<MembersVo> list2=service.checkaddr(value);
		return list2;
		
	}
	@RequestMapping("/json/asd")
	public String reta() {
		return "list";
	}
}
