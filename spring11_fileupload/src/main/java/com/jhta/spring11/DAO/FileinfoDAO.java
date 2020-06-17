package com.jhta.spring11.DAO;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.spring11.vo.FileinfoVo;

@Repository
public class FileinfoDAO {
	@Autowired
	private SqlSession session;
	
	private static final String NAMESPACE="com.jhta.mybatis.mapper.FileinfoMapper";
	
	public int insert(FileinfoVo vo) {
		return session.insert(NAMESPACE+".insert", vo);
	}
	public List<FileinfoVo> list(HashMap<String, Object> map){
		return session.selectList(NAMESPACE+".list",map);
	}
	public int count(HashMap<String, Object> map) {
		return session.selectOne(NAMESPACE+".count",map);
	}
	public int delete(int filenum) {
		return session.delete(NAMESPACE+".delete",filenum);
	}
	public int update(FileinfoVo vo) {
		return session.update(NAMESPACE+".update",vo);
	}
	public FileinfoVo getlist(int filenum) {
		return session.selectOne(NAMESPACE+".getinfo",filenum);
	}
}
