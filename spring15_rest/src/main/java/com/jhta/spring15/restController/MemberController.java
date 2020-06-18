package com.jhta.spring15.restController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import test.vo.MembersVo;

@RestController //이건 member가 응답하는걸 바로 응답함 responsebody 
public class MemberController {
	@RequestMapping(value = "/member",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE}) 
	//json으로 응답할수있도록,xml응답할수있도록
	public  MembersVo member() {
		MembersVo vo = new MembersVo(1,"홍길동","010","서울",new Date());
		return vo;
	}
	@RequestMapping(value = "/member/list",
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ArrayList<MembersVo> memberList(){
		ArrayList<MembersVo> list= new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"홍길동","010","서울",new Date()));
		list.add(new MembersVo(2,"이길동","011","인천",new Date()));
		list.add(new MembersVo(3,"삼길동","012","부평",new Date()));
		return list;
	}
	@RequestMapping(value = "/member/gradeList",
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public HashMap<String, Object> grade(){
		List<MembersVo> list = new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"홍길동","010","서울",new Date()));
		list.add(new MembersVo(2,"이길동","011","인천",new Date()));
		list.add(new MembersVo(3,"삼길동","012","부평",new Date()));
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list",list);
		map.put("grade","GOLD");
		return map; 
	}
}
