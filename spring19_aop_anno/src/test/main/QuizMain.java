package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dao.CommonsDao;
import test.dao.OracleDao;

/*
 * �Ű������� ���޵Ǵ� ���� ���ϰ��� ����ϴ� �����̽�
 * ����� ����ǵ��� �غ�����. ������̼� ������� ����� ������.
*/
public class QuizMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/app/app2.xml");
		CommonsDao dao =(CommonsDao)ac.getBean("dao");
		dao.delete("1");
		dao.insert("2");
		dao.update("3");
		dao.select("4");
	}
}
