package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(MyAppConfig.class);
		Person pp=(Person)ac.getBean("person");
		System.out.println("�̸�  : "+pp.getName());
		System.out.println("���� : "+pp.getAge());
		MembersDao dao=(MembersDao)ac.getBean("dao");
		System.out.println(" ���̵� :"+dao.getUser());
		System.out.println(" ��й�ȣ :"+dao.getPwd());
		
	}
}
