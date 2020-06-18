package com.jhta.spring14.controller;

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersVo;

@Controller
public class JSONController1 {
	@RequestMapping(value = "/members/list",produces = "application/json;charset=utf-8")
	@ResponseBody
	public String list() {
		ArrayList<MembersVo> list=new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"홍길동","010","서울",new Date()));
		list.add(new MembersVo(2,"이길동","011","인천",new Date()));
		list.add(new MembersVo(3,"삼길동","012","부평",new Date()));
		
		JSONArray arr = new JSONArray();
		for(MembersVo vo:list) {
			JSONObject json = new JSONObject();
			json.put("num", vo.getNum()); 
			json.put("name", vo.getName()); 
			json.put("phone", vo.getPhone());
			json.put("addr", vo.getAddr()); 
			json.put("regdate", vo.getRegdate());
			arr.put(json);
		}
		return arr.toString();
	}
	
	/*
	 * 요청정보를  path로 설정해서 보냄
	 * 예)http://localhost:9090/spring14/members/list2/1/test
	 * 
	 * @RequestMapping(value = "/members/list2/{num}/{id}",produces = "application/json;charset=utf-8")
	 * @ResponseBody
	 * public String list2(@PathVariable("num")int num) {
	 * */
	@RequestMapping(value = "/members/list2/{num}",produces = "application/json;charset=utf-8")
	@ResponseBody
	public String list2(@PathVariable("num")int num) {
		ArrayList<MembersVo> list2=new ArrayList<MembersVo>();
		list2.add(new MembersVo(1, "1", "2", "3", new Date()));
		list2.add(new MembersVo(2, "2", "3", "5", new Date()));
		list2.add(new MembersVo(3, "3", "4", "6", new Date()));
		list2.add(new MembersVo(4, "4", "5", "7", new Date()));
		list2.add(new MembersVo(5, "5", "6", "8", new Date()));
		JSONArray jarr = new JSONArray();
		for(MembersVo vo: list2) {
			JSONObject json = new JSONObject();
			json.put("num", vo.getNum()); 
			json.put("name", vo.getName()); 
			json.put("phone", vo.getPhone());
			json.put("addr", vo.getAddr()); 
			json.put("regdate", vo.getRegdate());
			jarr.put(json);
		}
		return jarr.toString();
	}
}
