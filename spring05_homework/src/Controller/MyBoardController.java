package Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.MyBoardService;
import vo.MyBoardVo;

public class MyBoardController {
	@Autowired
	private MyBoardService service;

	public MyBoardService getService() {
		return service;
	}

	public void setService(MyBoardService service) {
		this.service = service;
	}
	
	public int delete(int num) {
		System.out.println("@");
		return service.delete(num);
	}
	
	public int update(MyBoardVo vo) {
		return service.update(vo);
	}
	
	public int insert(MyBoardVo vo) {
		return service.insert(vo);
	}
	public List<MyBoardVo> select() {
		return service.select();
	}
	public MyBoardVo selectOne(int num) {
		return service.selectOne(num);
	}
	public List<MyBoardVo> searchByWriter(HashMap<String, String> map) {
		System.out.println("1");
		return service.searchByWriter(map);
	}
}
