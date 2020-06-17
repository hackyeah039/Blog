package test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.controller.MembersController;

public class TestMain {
	public static void main(String[] args) {
		//Bean���������� ����� �� ��ü���� ������
		//main�޼ҵ忡�� Controller�� ����� ������.
		ApplicationContext ac= new ClassPathXmlApplicationContext("test/app/app03.xml");
		MembersController mc = (MembersController)ac.getBean("controller");
		mc.execute();
	}
}
