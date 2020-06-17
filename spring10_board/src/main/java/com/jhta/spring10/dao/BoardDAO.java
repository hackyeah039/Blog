package com.jhta.spring10.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.spring10.vo.BoardVo;

@Repository
public class BoardDAO {
	private static final String NAMESPACE="com.jhta.mybatis.BoardMapper"; 
	
	@Autowired
	private SqlSession session;
	
	public int insert(BoardVo vo) {
		return session.insert(NAMESPACE+".insert",vo);
	}
	public List<BoardVo> list(HashMap<String, Object> map){
		return session.selectList(NAMESPACE+".list",map);
	}
	public int count(HashMap<String, Object> map){
		return session.selectOne(NAMESPACE+".count",map);
	}
	public BoardVo next(int num) {
		return session.selectOne(NAMESPACE+".next",num);
	}
	public BoardVo prev(int num) {
		return session.selectOne(NAMESPACE+".prev",num);
	}
	public int addHit(int num) {
		return session.update(NAMESPACE+".hit", num);
	}
	public BoardVo detail(int num) {
		return session.selectOne(NAMESPACE+".detail", num);
	}
	public List<BoardVo> recent(){
		return session.selectList(NAMESPACE+".recent");
	}
	public int delete(int num) {
		return session.delete(NAMESPACE+".delete",num);
	}
	public int update(BoardVo vo) {
		return session.update(NAMESPACE+".update",vo);
	}
}
