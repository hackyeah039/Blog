package test.dao;

import java.util.List ;

import org.apache.ibatis.session.SqlSession;

import test.vo.MembersVo;
/*
 * ������������ SqlSession�� ����������Ŭ�� �������� �����Ѵ�.
 * ->openSession(),close()�޼ҵ带 ����ڰ� ȣ������ ����(�������� ����)
 * ���� ������������ Ʈ����� ó���� �������� ó���Ѵ�.
 * ->commit(),rollback()�޼ҵ带 ����ڰ� ���� ȣ������ ����
 */
public class MembersDao {
	private SqlSession session;//�� ��ü�� sqlSessionTemplate�� �׷����� Spring�� ����������Ŭ ������ ��, �׳� sqlSession�̸� �������� 
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
