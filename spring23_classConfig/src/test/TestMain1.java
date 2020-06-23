package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.dao.MembersDao;
public class TestMain1 {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig1.class);
		MembersDao dao=(MembersDao)ac.getBean("membersDao");
		int n=dao.insert(new MembersVo(111,"김","010","경기",null));
		System.out.println(n+"명의 회원등록성공");
	}
}
