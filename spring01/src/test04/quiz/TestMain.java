package test04.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 					CommonDao  : DAO�� ������ �� ��� �����ϴ� �������̽�
 *                      | 
 *                   JDBCDao   : �������̽� ������ Ŭ����(���θ� ����)
 *                   
 *                  MyController -> JDBCDao����
 * 
 * ���� ������ �ش��ϴ� �������̽��� Ŭ������ �����ϰ� �������� ���� ��ü ������ ����� ������.
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=  
				new ClassPathXmlApplicationContext("test04/quiz/app04.xml");
		MyController mc =(MyController)ac.getBean("MyController");//�̱���Ÿ��
		mc.service();
		System.out.println("mc "+mc);
		
		MyController mc2 =(MyController)ac.getBean("MyController");
		System.out.println("mc2 "+mc2);
	}
}
