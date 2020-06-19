package test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dao.MembersDAO;
import test.dao.MembersDAOImpl;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/app/app1.xml");
		MembersDAO dao = (MembersDAO)ac.getBean("dao");
		dao.delete("����Ʈ");
		dao.insert("�μ�Ʈ");
		dao.update("������Ʈ");
		dao.select("����Ʈ");
	}
}
