package test.service;

import java.util.List;

import test.dao.MembersDao;
import test.vo.MembersVo;

public class MembersService {
	private MembersDao dao;
	public void setDao(MembersDao dao) {
		this.dao = dao;
	}
	public int insert(MembersVo vo) {
		return dao.insert(vo);
	}
	public int update(MembersVo vo) {
		return dao.update(vo);
	}
	public int delete(int num) {
		return dao.delete(num);
	}
	public List<MembersVo> list() {
		return dao.list();
	}
	public MembersVo selectOne(int num) {
		return dao.selectOne(num);
	}
}
