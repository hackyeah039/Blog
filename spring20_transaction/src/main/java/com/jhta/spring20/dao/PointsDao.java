package com.jhta.spring20.dao;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import com.jhta.spring20.vo.PointsVo;

public class PointsDao {
	private SqlSessionTemplate sqlSessionTemplate;
	
	private final static String NAMESPACE ="mybatis.PointsMapper";
	
	public int insert(PointsVo vo) {
		return sqlSessionTemplate.insert(NAMESPACE+".insert",vo);
	}
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
}
