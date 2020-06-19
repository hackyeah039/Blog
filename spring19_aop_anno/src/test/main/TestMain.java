package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dao.OracleDao;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/app/app1.xml");
		OracleDao dao = (OracleDao)ac.getBean("dao");
		dao.delete("asd");
		dao.insert("dd");
		dao.update("11");
		dao.select("cc");
	}
}
