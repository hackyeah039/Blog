package test02.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("test02/di/app02.xml");
		MembersController mc=
				(MembersController)ac.getBean("MembersController");
		mc.service();
	}
}
