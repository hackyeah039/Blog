package main;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.MyBoardController;
import vo.MyBoardVo;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("xml/app.xml");
		
		MyBoardController mc = (MyBoardController)ac.getBean("controller");
//		int n=mc.delete(81);
//		System.out.println(n+"명 삭제");
//		int n1=mc.insert(new MyBoardVo(43,"1","2","3","4",null));
//		System.out.println(n1+"명 추가");
//		int n2=mc.update(new MyBoardVo(43,"변경","변경","변경","변경",null));
//		System.out.println(n2+"명 수정");
//		List<MyBoardVo> list =mc.select();
//		for(MyBoardVo vo:list) {
//			System.out.println(vo.getContent());
//			System.out.println(vo.getNum());
//			System.out.println(vo.getPwd());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getWriter());
//			System.out.println(vo.getRegdate());
//		}
//		MyBoardVo vo =mc.selectOne(43);
//		System.out.println(vo.getContent());
//		System.out.println(vo.getNum());
//		System.out.println(vo.getPwd());
//		System.out.println(vo.getTitle());
//		System.out.println(vo.getWriter());
//		System.out.println(vo.getRegdate());
//		String keyword="헬로";//찾을려는 키워드
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("writer",keyword);
//		map.put("title",keyword);
//		List<MyBoardVo> list =mc.searchByWriter(map);
//		System.out.println("마지막");
//		for(MyBoardVo vo:list) {
//			System.out.println(vo.getContent());
//			System.out.println(vo.getNum());
//			System.out.println(vo.getPwd());
//			System.out.println(vo.getTitle());
//			System.out.println(vo.getWriter());
//			System.out.println(vo.getRegdate());
//			System.out.println("---------------------------");
//		}
	}
}
