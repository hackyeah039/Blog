package test05.jdbc;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.vo.MembersVo;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac=
				new ClassPathXmlApplicationContext("test05/jdbc/app05.xml");
		
		MembersDao dao=(MembersDao)ac.getBean("dao");
		//MembersVo vo= new MembersVo(10,"����","010","����",null);
		//int n=dao.insert(vo);
		//System.out.println(n+"���� ȸ���� ��ϵǾ����ϴ�.");
		//int n1=dao.delete(10);
		//System.out.println(n1+"���� ȸ���� �����Ǿ����ϴ�.");
		//int n2=dao.update(new MembersVo(1,"�ٲ��̸�","�ٲ۹�ȣ","�ٲ��ּ�",null));
		//System.out.println(n2+"���� ȸ���� ������������ϴ�.");
		
//		List<MembersVo> list=dao.list();
//		for(MembersVo vo2:list) {
//			System.out.println("ȸ����ȣ" +vo2.getNum());
//			System.out.println("ȸ���ּ�" +vo2.getAddr());
//			System.out.println("ȸ���̸�" +vo2.getName());
//			System.out.println("ȸ����ȭ" +vo2.getPhone());
//			System.out.println("ȸ������" +vo2.getRegdate());
//		}
//		System.out.println("----------------------------");
//		MembersVo vo=dao.getinfo(1);
//		System.out.println("ȸ����ȣ" +vo.getNum());
//		System.out.println("ȸ���ּ�" +vo.getAddr());
//		System.out.println("ȸ���̸�" +vo.getName());
//		System.out.println("ȸ����ȭ" +vo.getPhone());
//		System.out.println("ȸ������" +vo.getRegdate());
//		System.out.println("----------------------------");
		//ȸ�������� �̸����� ��ȸ�ϱ�
		List<MembersVo> vo3=dao.getInfoByName("��");
		for(MembersVo vo4 :vo3) {
			System.out.println("ȸ����ȣ" +vo4.getNum());
			System.out.println("ȸ���ּ�" +vo4.getAddr());
			System.out.println("ȸ���̸�" +vo4.getName());
			System.out.println("ȸ����ȭ" +vo4.getPhone());
			System.out.println("ȸ������" +vo4.getRegdate());
		}
	}
}
