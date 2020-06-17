package com.jhta.spring12.Controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.vo.MembersVo;

@Controller
public class MemberXMLController {
	//������ xml�� �ϱ�
	@RequestMapping(value = "/members/xml",
			produces = "application/xml;charset=utf-8")
	@ResponseBody //�����Ѱ���ü�� ��ȯ�ϰڴ�. 
	//�����Ҷ�  xml �ϳ��ϳ� �� �����(������ �Ѱ�)->�̹����� �ٸ����
	private String getList() {
		ArrayList<MembersVo> list=new ArrayList<MembersVo>();
		//long t=System.currentTimeMillis();
		//Date d=nnew Date(t);
		//java.utl=>java.sql �� �� ��ȯ �ϴ°��
		java.util.Date d=new java.util.Date();//util (��.��.�� ����)
		Date regdate=new Date(d.getTime());//sql�� ��ȯ
		
		list.add(new MembersVo(1,"ȫ�浿","010","����",null ));
		list.add(new MembersVo(2,"�̱浿","011","�λ�",null ));
		list.add(new MembersVo(3,"��浿","012","����",null ));
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
		return sb.toString(); //�ҷ���  jsp�� �ٽú����� (@responseBody) ,ajax�� ������ �̵��������� �ȵǴϱ�
	}
}
