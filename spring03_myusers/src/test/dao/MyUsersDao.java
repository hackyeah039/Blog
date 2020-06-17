package test.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import test.vo.MyUsersVo;

public class MyUsersDao {
	private final String NAMESPACE="test.main.MyUsersMapper";
	private SqlSessionTemplate mybatis;

	public SqlSessionTemplate getMybatis() {
		return mybatis;
	}

	public void setMybatis(SqlSessionTemplate mybatis) {
		this.mybatis = mybatis;
	}
	
	public int insert(MyUsersVo vo) {
		int n=mybatis.insert(NAMESPACE+".insert",vo);
		return n;
	}
	public int update(MyUsersVo vo) {
		int n=mybatis.update(NAMESPACE+".update",vo);
		return n;
	}
	public int delete(String id) {
		int n=mybatis.delete(NAMESPACE+".delete",id);
		return n;
	}
	public List<MyUsersVo> select(){
		List<MyUsersVo> list=mybatis.selectList(NAMESPACE+".select");
		return list;
	}
	public MyUsersVo selectOne(String id) {
		MyUsersVo vo=mybatis.selectOne(NAMESPACE+".selectOne",id);
		return vo;
	}
}
