package test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("test/app06.xml");
		
		MyUsersDao dao = (MyUsersDao)ac.getBean("dao");
		//int n=dao.delete("07id");
		//System.out.println(n+"�� ����");
		//int n=dao.insert(new MyUsersVo("�߰����̵�","�߰���й�ȣ","�߰��̸���",null));
		//System.out.println(n+"�� �߰�");
		//int n=dao.update(new MyUsersVo("id","3333","asd",null));
		//System.out.println(n+"�� ����");
		List<MyUsersVo> list =dao.list();
		for(MyUsersVo vo:list) {
			System.out.println(vo.getEmail() +"�̸���!");
			System.out.println(vo.getId() +"���̵�!");
			System.out.println(vo.getPwd() +"��й�ȣ!");
			System.out.println(vo.getMakedate() +"������¥!");
			System.out.println("--------------------------");
		}
	}
}
