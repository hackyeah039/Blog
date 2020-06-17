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
		//MembersVo vo= new MembersVo(10,"김디비","010","종로",null);
		//int n=dao.insert(vo);
		//System.out.println(n+"명의 회원이 등록되었습니다.");
		//int n1=dao.delete(10);
		//System.out.println(n1+"명의 회원이 삭제되었습니다.");
		//int n2=dao.update(new MembersVo(1,"바꾼이름","바꾼번호","바꾼주소",null));
		//System.out.println(n2+"명의 회원이 수저오디었습니다.");
		
//		List<MembersVo> list=dao.list();
//		for(MembersVo vo2:list) {
//			System.out.println("회원번호" +vo2.getNum());
//			System.out.println("회원주소" +vo2.getAddr());
//			System.out.println("회원이름" +vo2.getName());
//			System.out.println("회원전화" +vo2.getPhone());
//			System.out.println("회원가입" +vo2.getRegdate());
//		}
//		System.out.println("----------------------------");
//		MembersVo vo=dao.getinfo(1);
//		System.out.println("회원번호" +vo.getNum());
//		System.out.println("회원주소" +vo.getAddr());
//		System.out.println("회원이름" +vo.getName());
//		System.out.println("회원전화" +vo.getPhone());
//		System.out.println("회원가입" +vo.getRegdate());
//		System.out.println("----------------------------");
		//회원데이터 이름으로 조회하기
		List<MembersVo> vo3=dao.getInfoByName("자");
		for(MembersVo vo4 :vo3) {
			System.out.println("회원번호" +vo4.getNum());
			System.out.println("회원주소" +vo4.getAddr());
			System.out.println("회원이름" +vo4.getName());
			System.out.println("회원전화" +vo4.getPhone());
			System.out.println("회원가입" +vo4.getRegdate());
		}
	}
}
