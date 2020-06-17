package test03.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("test03/di/app03.xml");
		MyUsersController mc=(MyUsersController)ac.getBean("MyusersController");
		mc.service();
	}
}
