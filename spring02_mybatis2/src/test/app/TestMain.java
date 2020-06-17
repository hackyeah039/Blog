package test.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatis.MembersVo;
import test.dao.MembersDao;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test/app/app01.xml");
		MembersDao dao= (MembersDao)ac.getBean("dao");
		//int n=dao.insert(new MembersVo(11,"���浿","010","�λ�",null));
		//System.out.println(n+"���� �߰��Ǿ����ϴ�.");
//		List<MembersVo> list=dao.list();
//		System.out.println("<<��üȸ�����>>");
//		for(MembersVo vo:list) {
//			System.out.println(vo.getNum());
//			System.out.println(vo.getAddr());
//			System.out.println(vo.getName());
//			System.out.println(vo.getPhone());
//			System.out.println(vo.getRegdate());
//		}
//		int n=dao.delete(1);
//		System.out.println(n+"�� ����");
//		int n=dao.update(new MembersVo(2,"����","����","�ּ�",null));
//		System.out.println(n+"�� ����");
		
		MembersVo vo=dao.selectOne(2);
		System.out.println(vo.getNum());
		System.out.println(vo.getAddr());
		System.out.println(vo.getName());
		System.out.println(vo.getPhone());
		System.out.println(vo.getRegdate());
	}
}
