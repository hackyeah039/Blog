package com.jhta.spring20.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jhta.spring20.vo.PointsVo;
@Repository
public class PointsDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final static String NAMESPACE ="mybatis.PointsMapper";
	
	public int insert(PointsVo vo) {
		return sqlSessionTemplate.insert(NAMESPACE+".insert",vo);
	}
	
}
