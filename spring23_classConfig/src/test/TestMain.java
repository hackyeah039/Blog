package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(MyAppConfig.class);
		Person pp=(Person)ac.getBean("person");
		System.out.println("이름  : "+pp.getName());
		System.out.println("나이 : "+pp.getAge());
		MembersDao dao=(MembersDao)ac.getBean("dao");
		System.out.println(" 아이디 :"+dao.getUser());
		System.out.println(" 비밀번호 :"+dao.getPwd());
		
	}
}
