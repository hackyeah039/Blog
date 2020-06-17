package test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("test/app06.xml");
		
		MyUsersDao dao = (MyUsersDao)ac.getBean("dao");
		//int n=dao.delete("07id");
		//System.out.println(n+"명 삭제");
		//int n=dao.insert(new MyUsersVo("추가아이디","추가비밀번호","추가이메일",null));
		//System.out.println(n+"명 추가");
		//int n=dao.update(new MyUsersVo("id","3333","asd",null));
		//System.out.println(n+"명 수정");
		List<MyUsersVo> list =dao.list();
		for(MyUsersVo vo:list) {
			System.out.println(vo.getEmail() +"이메일!");
			System.out.println(vo.getId() +"아이디!");
			System.out.println(vo.getPwd() +"비밀번호!");
			System.out.println(vo.getMakedate() +"생성날짜!");
			System.out.println("--------------------------");
		}
	}
}
