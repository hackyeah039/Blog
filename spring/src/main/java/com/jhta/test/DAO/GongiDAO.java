package com.jhta.test.DAO;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.test.VO.Gongivo;

@Repository
public class GongiDAO {
	
	private static final String NAMESPACE="com.jhta.mybatis.mapper.GongiMapper";
	
	@Autowired
	private SqlSession sqlsession;
	
	public int insert(Gongivo vo) {
		return sqlsession.insert(NAMESPACE+".insert",vo);
	} 
	public int count(HashMap<String, Object> map) {
		return sqlsession.selectOne(NAMESPACE+".count",map);
	}
	public List<Gongivo> list(HashMap<String, Object> map){
		//System.out.println(map.get("keyword") +" keyword " +map.get("field") + " field ");
		return sqlsession.selectList(NAMESPACE+".list",map);
	}
	public int delete(int num){
		return sqlsession.delete(NAMESPACE+".delete",num);
	}
}
