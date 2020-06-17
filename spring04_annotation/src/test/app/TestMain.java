package test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.controller.MembersController;

public class TestMain {
	public static void main(String[] args) {
		//Bean설정파일을 만들고 각 객체들을 설정후
		//main메소드에서 Controller를 사용해 보세요.
		ApplicationContext ac= new ClassPathXmlApplicationContext("test/app/app03.xml");
		MembersController mc = (MembersController)ac.getBean("controller");
		mc.execute();
	}
}
