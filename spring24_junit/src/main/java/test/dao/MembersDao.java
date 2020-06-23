package test.dao;

import java.util.List ;

import org.apache.ibatis.session.SqlSession;

import test.vo.MembersVo;
/*
 * 스프링에서는 SqlSession의 라이프사이클을 스프링이 관리한다.
 * ->openSession(),close()메소드를 사용자가 호출하지 않음(스프링이 관리)
 * 또한 스프링에서는 트랜잭션 처리도 스프링이 처리한다.
 * ->commit(),rollback()메소드를 사용자가 직접 호출하지 않음
 */
public class MembersDao {
	private SqlSession session;//얘 실체는 sqlSessionTemplate임 그래야지 Spring이 라이프사이클 관리를 함, 그냥 sqlSession이면 관리ㄴㄴ 
	private final String NAMESPACE ="mybatis.MembersMapper";
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	public int insert(MembersVo vo) {
		int n=session.insert(NAMESPACE+".insert",vo);
		return n;
	}
	public List<MembersVo> list(){
		List<MembersVo> mlist=session.selectList(NAMESPACE+".list");
		return mlist;
	}
	public int delete(int num) {
		int n=session.delete(NAMESPACE+".delete",num);
		return n;
	}
	public int update(MembersVo vo) {
		int n=session.update(NAMESPACE+".update", vo);
		return n;
	}
	public MembersVo selectOne(int num) {
		MembersVo vo=session.selectOne(NAMESPACE+".selectOne",num);
		return vo;
	}
}
