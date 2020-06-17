package test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.dao.MyUsersDao;
import test.vo.MyUsersVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/app/app02.xml");
		MyUsersDao dao=(MyUsersDao)ac.getBean("dao");
		//�߰�
//		int n=dao.insert(new MyUsersVo("id2","pwd2","email2",null));
//		System.out.println(n+"�� �߰�");
		//����
//		int n=dao.delete("id2");
//		System.out.println(n+"�� ����");
		//����
//		int n=dao.update(new MyUsersVo("id","�ٲ۰�","�ٲ۰�",null));
//		System.out.println(n+"�� ����");
//		List<MyUsersVo> list =dao.select();
		//��ü
//		for(MyUsersVo vo:list) {
//			System.out.println(vo.getId());
//			System.out.println(vo.getEmail());
//			System.out.println(vo.getPwd());
//			System.out.println(vo.getMakedate());
//		}
		//�Ѹ�
//		MyUsersVo vo=dao.selectOne("asd");
//		System.out.println(vo.getId());
//		System.out.println(vo.getEmail());
//		System.out.println(vo.getPwd());
//		System.out.println(vo.getMakedate());
	}
}
