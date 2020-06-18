package testmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jhta.spring17.DAO.CommonsDao;
import com.jhta.spring17.DAO.OracleDao;

/*
 * dao클래스내의 메소드가 실행되는 처리시간을 구해서 출력하느 기능을
 * AOP를 사용해 구현해 보세요.
 * System.
 * */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testmain/app1.xml");
		CommonsDao dao =(CommonsDao)ac.getBean("dao");
		dao.delete("첫번째");
		dao.insert("두번째");
		dao.select("세번째");
		dao.update("네번째");
	}
}
