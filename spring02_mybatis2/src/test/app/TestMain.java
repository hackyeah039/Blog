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
		//int n=dao.insert(new MembersVo(11,"나길동","010","부산",null));
		//System.out.println(n+"명이 추가되었습니다.");
//		List<MembersVo> list=dao.list();
//		System.out.println("<<전체회원목록>>");
//		for(MembersVo vo:list) {
//			System.out.println(vo.getNum());
//			System.out.println(vo.getAddr());
//			System.out.println(vo.getName());
//			System.out.println(vo.getPhone());
//			System.out.println(vo.getRegdate());
//		}
//		int n=dao.delete(1);
//		System.out.println(n+"명 삭제");
//		int n=dao.update(new MembersVo(2,"김김김","저나","주소",null));
//		System.out.println(n+"명 수정");
		
		MembersVo vo=dao.selectOne(2);
		System.out.println(vo.getNum());
		System.out.println(vo.getAddr());
		System.out.println(vo.getName());
		System.out.println(vo.getPhone());
		System.out.println(vo.getRegdate());
	}
}
