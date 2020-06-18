package testmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jhta.spring17.DAO.CommonsDao;
import com.jhta.spring17.DAO.OracleDao;

/*
 * daoŬ�������� �޼ҵ尡 ����Ǵ� ó���ð��� ���ؼ� ����ϴ� �����
 * AOP�� ����� ������ ������.
 * System.
 * */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("testmain/app1.xml");
		CommonsDao dao =(CommonsDao)ac.getBean("dao");
		dao.delete("ù��°");
		dao.insert("�ι�°");
		dao.select("����°");
		dao.update("�׹�°");
	}
}
