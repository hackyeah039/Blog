package com.jhta.spring16.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jhta.spring16.dao.MembersDAO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/jhta/spring16/app/app01.xml");
		MembersDAO dao =(MembersDAO)ac.getBean("membersDao");
		dao.insert("ȫ�浿1");
		dao.update("ȫ�浿2");
		dao.delete("ȫ�浿3");
		dao.select("ȫ�浿4");
	}
}
