package dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import vo.MyBoardVo;

public class MyBoardDao {
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE ="xml.MyBoard";
	
	
	public int delete(int num) {
		System.out.println("4");
		return sqlSession.delete(NAMESPACE+".delete",num);
	}
	public int update(MyBoardVo vo) {
		return sqlSession.update(NAMESPACE+".update",vo);
	}
	public int insert(MyBoardVo vo) {
		return sqlSession.insert(NAMESPACE+".insert",vo);
	}
	public List<MyBoardVo> select() {
		return sqlSession.selectList(NAMESPACE+".select");
	}
	public MyBoardVo selectOne(int num) {
		return sqlSession.selectOne(NAMESPACE+".selectOne",num);
	}
	public List<MyBoardVo> searchByWriter(HashMap<String, String> map) {
		System.out.println("3");
		return sqlSession.selectList(NAMESPACE+".searchByWriter",map);
	}
}
