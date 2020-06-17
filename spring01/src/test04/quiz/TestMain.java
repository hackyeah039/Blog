package test04.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 					CommonDao  : DAO가 가져야 할 목록 제시하는 인터페이스
 *                      | 
 *                   JDBCDao   : 인터페이스 구현한 클래스(말로만 연동)
 *                   
 *                  MyController -> JDBCDao주입
 * 
 * 위의 구조에 해당하는 인터페이스와 클래스를 구현하고 스프링을 통해 객체 생성후 사용해 보세요.
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=  
				new ClassPathXmlApplicationContext("test04/quiz/app04.xml");
		MyController mc =(MyController)ac.getBean("MyController");//싱글톤타입
		mc.service();
		System.out.println("mc "+mc);
		
		MyController mc2 =(MyController)ac.getBean("MyController");
		System.out.println("mc2 "+mc2);
	}
}
