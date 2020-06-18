package com.jhta.spring14.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersVo;

@Controller
public class JSONController2 {
	@RequestMapping("/json")
	private String json() {
		return "json";
	}
	@RequestMapping("/json/list")
	@ResponseBody
	public List<MembersVo> list(){
		ArrayList<MembersVo> list = new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"홍길동","010","서울",new Date()));
		list.add(new MembersVo(2,"이길동","011","인천",new Date()));
		list.add(new MembersVo(3,"삼길동","012","부평",new Date()));
		return list;
	}
	@RequestMapping(value = "/json/find/{num}",produces = "application/json;charset=utf-8")
	@ResponseBody
	public MembersVo find(int num) {
		 if(num==1) {
			 return new MembersVo(1,"홍길동","010","서울",new Date());
		 }else {
			 return new MembersVo(2,"이길동","011","인천",new Date());
		 }
	}
	@RequestMapping("/json/find1")
	@ResponseBody
	public HashMap<String, Object> data(){
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("grade","gold");
		map.put("name","이길동");
		map.put("email","test@daum.net");
		ArrayList<MembersVo> list = new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"홍길동","010","서울",new Date()));
		list.add(new MembersVo(2,"이길동","011","인천",new Date()));
		list.add(new MembersVo(3,"삼길동","012","부평",new Date()));
		map.put("list",list);
		return map;
	}
}
