package com.jhta.spring12.Controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersVo;

@Controller
public class IdcheckControllerXML {

		@RequestMapping(value = "/idcheck/xml",
				produces = "application/xml;charset=utf-8")
		@ResponseBody
		private String getList() {
			String[] one= {"1","홍길동","010","안동3","email1",null};
			String[] two= {"2"," 이길동","011","안동2","email2",null};
			String[] three= {"3","삼길동","012","안동1","email3",null};
			String[] four= {"4","사길동","013","안동","email4",null};
			ArrayList<String[]> list= new ArrayList<String[]>();
			list.add(one);
			list.add(two);
			list.add(three);
			list.add(four);
			StringBuffer sb= new StringBuffer();
			sb.append("<members>");
			for (int i = 0; i < list.size(); i++) {
				sb.append("<member>");
				sb.append("<num>"+list.get(i)[0]+"</num>");
				sb.append("<name>"+list.get(i)[1]+"</name>");
				sb.append("<phone>"+list.get(i)[2]+"</phone>");
				sb.append("<addr>"+list.get(i)[3]+"</addr>");
				sb.append("<regdate>"+list.get(i)[5]+"</regdate>");
				sb.append("<email>"+list.get(i)[4]+"</email>");
				sb.append("</member>");
			}
			sb.append("</members>");
			return sb.toString();
		}
}
