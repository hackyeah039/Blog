package test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mybatis.MembersVo;
import test.dao.MembersDao;

public class MembersService {
	@Autowired
	private MembersDao dao;
	
	public int insert(MembersVo vo) {
		return dao.insert(vo);
	}
	public int update(MembersVo vo) {
		return dao.update(vo);
	}
	public int delete(int num) {
		return dao.delete(num);
	}
	public MembersVo select(int num) {
		MembersVo list=dao.selectOne(num);
		return list;
	}
}
