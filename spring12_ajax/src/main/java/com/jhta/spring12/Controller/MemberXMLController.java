package com.jhta.spring12.Controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersVo;

@Controller
public class MemberXMLController {
	//응답을 xml로 하기
	@RequestMapping(value = "/members/xml",
			produces = "application/xml;charset=utf-8")
	@ResponseBody //응답한값자체를 반환하겠다. 
	//응답할때  xml 하나하나 다 만든것(예전에 한것)->이번에는 다른방식
	private String getList() {
		ArrayList<MembersVo> list=new ArrayList<MembersVo>();
		//long t=System.currentTimeMillis();
		//Date d=nnew Date(t);
		//java.utl=>java.sql 로 형 변환 하는경우
		java.util.Date d=new java.util.Date();//util (시.분.초 포함)
		Date regdate=new Date(d.getTime());//sql로 변환
		
		list.add(new MembersVo(1,"홍길동","010","서울",null ));
		list.add(new MembersVo(2,"이길동","011","부산",null ));
		list.add(new MembersVo(3,"삼길동","012","제주",null ));
		StringBuffer sb = new StringBuffer();
		sb.append("<members>");
		for(MembersVo vo:list) {
			sb.append("<member>");
			sb.append("<num>"+vo.getNum()+"</num>");
			sb.append("<name>"+vo.getName()+"</name>");
			sb.append("<phone>"+vo.getPhone()+"</phone>");
			sb.append("<addr>"+vo.getAddr()+"</addr>");
			sb.append("<regdate>"+vo.getRegdate()+"</regdate>");
			sb.append("</member>");
		}
		sb.append("</members>");
		return sb.toString(); //불러온  jsp로 다시보내기 (@responseBody) ,ajax는 페이지 이동이있으면 안되니깐
	}
}
