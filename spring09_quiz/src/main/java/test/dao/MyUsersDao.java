package test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.vo.MyUsersVo;

@Repository
public class MyUsersDao {
	@Autowired
	private SqlSession session;
	
	private final String NAMESPACE="mybatis.MyUsersMapper";
	
	public List<MyUsersVo> select() {
		return session.selectList(NAMESPACE+".select");
	}
	public MyUsersVo getinfo(String id) {
		return session.selectOne(NAMESPACE+".getinfo");
	}
	public int insert(MyUsersVo vo) {
		return session.insert(NAMESPACE+".insert");
	}
	public int update(MyUsersVo vo) {
		return session.update(NAMESPACE+".update");
	}
	public int delete(String id) {
		return session.delete(NAMESPACE+".delete");
	}
}
