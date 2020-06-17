package com.jhta.spring12.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersList;
import test.vo.MembersVo;

@Controller
public class MemberXMLController1 {
		java.util.Date d=new java.util.Date();//util (��.��.�� ����)
		@RequestMapping("/xml/list1")
		@ResponseBody
		public MembersList getlist() {
			MembersList members=new MembersList();
			List<MembersVo> list=new ArrayList<MembersVo>();
			list.add(new MembersVo(1,"ȫ�浿","010","����",d ));
			list.add(new MembersVo(2,"�̱浿","011","�λ�",d ));
			list.add(new MembersVo(3,"��浿","012","����",d ));
			members.setList(list);
			members.setGrade("gold");
			return members;
		}
}
