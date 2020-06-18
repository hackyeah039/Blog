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

@RestController //�̰� member�� �����ϴ°� �ٷ� ������ responsebody 
public class MemberController {
	@RequestMapping(value = "/member",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,MediaType.APPLICATION_XML_VALUE}) 
	//json���� �����Ҽ��ֵ���,xml�����Ҽ��ֵ���
	public  MembersVo member() {
		MembersVo vo = new MembersVo(1,"ȫ�浿","010","����",new Date());
		return vo;
	}
	@RequestMapping(value = "/member/list",
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ArrayList<MembersVo> memberList(){
		ArrayList<MembersVo> list= new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"ȫ�浿","010","����",new Date()));
		list.add(new MembersVo(2,"�̱浿","011","��õ",new Date()));
		list.add(new MembersVo(3,"��浿","012","����",new Date()));
		return list;
	}
	@RequestMapping(value = "/member/gradeList",
			produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public HashMap<String, Object> grade(){
		List<MembersVo> list = new ArrayList<MembersVo>();
		list.add(new MembersVo(1,"ȫ�浿","010","����",new Date()));
		list.add(new MembersVo(2,"�̱浿","011","��õ",new Date()));
		list.add(new MembersVo(3,"��浿","012","����",new Date()));
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("list",list);
		map.put("grade","GOLD");
		return map; 
	}
}
