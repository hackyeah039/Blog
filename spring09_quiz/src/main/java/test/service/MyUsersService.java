package test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.MyUsersDao;
import test.vo.MyUsersVo;
@Service
public class MyUsersService {
	@Autowired
	private MyUsersDao dao;
	
	public int insert(MyUsersVo vo) {
		return dao.insert(vo);
	}
	public int update(MyUsersVo vo) {
		return dao.update(vo);
	}
	public int delete(String id) {
		return dao.delete(id);
	}
	public List<MyUsersVo> select(){
		return dao.select();
	}
	public MyUsersVo getinfo(String id) {
		return dao.getinfo(id);
	}
}
