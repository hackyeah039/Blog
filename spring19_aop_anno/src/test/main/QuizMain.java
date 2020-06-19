package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dao.CommonsDao;
import test.dao.OracleDao;

/*
 * 매개변수로 전달되는 값과 리턴값을 출력하는 어드바이스
 * 만들고 적용되도록 해보세요. 어노테이션 기반으로 만들어 보세요.
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
