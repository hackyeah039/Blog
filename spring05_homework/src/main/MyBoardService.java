package main;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.MyBoardDao;
import vo.MyBoardVo;

public class MyBoardService { //Controller와 dao사이의 관계
	@Autowired
	private MyBoardDao dao;

	public MyBoardDao getDao() {
		return dao;
	}

	public void setDao(MyBoardDao dao) {
		this.dao = dao;
	}
	
	public int delete(int num) {
		System.out.println("3");
		return dao.delete(num);
	}
	public int update(MyBoardVo vo) {
		return dao.update(vo);
	}
	public int insert(MyBoardVo vo) {
		return dao.insert(vo);
	}
	public List<MyBoardVo> select(){
		return dao.select();
	}
	public MyBoardVo selectOne(int num) {
		return dao.selectOne(num);
	}
	public List<MyBoardVo> searchByWriter(HashMap<String, String> map){
		System.out.println("2");
		return dao.searchByWriter(map);
	}
}
