package test.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import test.MembersVo;

public class MembersDao extends JdbcDaoSupport{
	public int insert(MembersVo vo) {
		String sql="insert into members1 values(?,?,?,?,sysdate)";
		int n=getJdbcTemplate().update(sql, vo.getNum(), vo.getName(),vo.getPhone(),vo.getAddr());
		return n;
	}
	//delete �޼ҵ� �߰�
	public int delete(int num) {
		String sql="delete from members1 where num=?";
		int n=getJdbcTemplate().update(sql,num );
		return n;
	}	
	public List<Map<String, Object>> list(){
		String sql="select * from members1";
		return getJdbcTemplate().queryForList(sql);
	}
	//��ü ����� List�� ��Ƽ� �����ϴ� �޼ҵ� �߰��� ������
}
