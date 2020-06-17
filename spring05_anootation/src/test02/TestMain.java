package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("test02/app02.xml");
		MyController con =(MyController)ac.getBean("con");
		con.execute();
	}
}
