package com.jhta.spring20.dao;

import java.util.List ;
import org.apache.ibatis.session.SqlSession;
import com.jhta.spring20.vo.MembersVo;

public class MembersDao {
	private SqlSession session; 
	private final String NAMESPACE ="mybatis.MembersMapper";
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	public int insert(MembersVo vo) {
		System.out.println(vo.getAddr()+":"+vo.getName()+":"+vo.getNum()+":"+vo.getPhone()+":"+vo.getRegdate());
		int n=session.insert(NAMESPACE+".insert",vo);
		System.out.println("dao³¡");
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
