package com.jhta.spring13.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.spring13.VO.CommentsVo;

@Repository
public class CommentsDAO {
	@Autowired
	private SqlSession sqlsession;
	private static final String NAMESPACE="com.jhta.mybatis.CommentsMapper";
	
	public int insert(CommentsVo vo) {
		return sqlsession.insert(NAMESPACE+".insert",vo);
	}
	public List<CommentsVo> list(HashMap<String, Object> map){
		return sqlsession.selectList(NAMESPACE+".getList",map);
	}
	public int count(int mnum) {
		return sqlsession.selectOne(NAMESPACE+".count",mnum);
	}
	public int delete(int num) {
		return sqlsession.delete(NAMESPACE+".delete",num);
	}
	public int update(CommentsVo vo) {
		return sqlsession.update(NAMESPACE+".update",vo);
	}
	public CommentsVo getinfo(int num) {
		return sqlsession.selectOne(NAMESPACE+".getinfo",num);
	}
}
