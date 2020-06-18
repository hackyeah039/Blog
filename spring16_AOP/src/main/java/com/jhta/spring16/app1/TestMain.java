package com.jhta.spring16.app1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jhta.spring16.dao.MembersDAO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/jhta/spring16/app1/app02.xml");
		MembersDAO dao = (MembersDAO)ac.getBean("dao");
		dao.delete("하이1");
		dao.update("하잊2");
		dao.select(" 하이3");
		dao.insert("하이4");
	}
}
