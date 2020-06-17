package test05.jdbc;
/*
 * Spring������ jdbc�۾��� �Ҷ� JDBc�� �ݺ��Ǵ� �۾��� ���ø�ȭ��
 * JDBCTemplate�� ����Ѵ� 
 */

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.vo.MembersVo;


import test.vo.MembersVo;
//Dao<=JdbcTemplate <=dataSource(Url,user,connectionPool���� ������)
public class MembersDao {
	private JdbcTemplate jdbcTemplate;
	//������ �����Ѱ� �޾ƿ;��ϴ� (������,���� �����ϳ��� �޾ƾ� ��)
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(MembersVo vo) { //������ JDBC�� �����ߴ� �κе��� Spring�� �����ְ�, �츮�� ���������� �������ִ� �κп� ����!
		String sql="insert into members1 values(?,?,?,?,sysdate)";
		//jdbcTemplate.update(������sql����,?�� �����Ǵ� ����)
		int n=jdbcTemplate.update(sql,vo.getNum(),vo.getName(),vo.getPhone(),vo.getAddr());
		//(String sql,Object... args)==����������, �󸶵��� ���� �������ִ�. �Ķ���Ͱ����� �迭�� �����ؼ� �󸶵��� �־ �� 
		return n;
	}
	public int delete(int num) {
		String sql="delete from members1 where num=?";
		int n=jdbcTemplate.update(sql, num);
		return n;
	}
	public int update(MembersVo vo) {
		String sql="update members1 set phone=?, name=? ,addr=? where num=?";
		int n=jdbcTemplate.update(sql,vo.getPhone(),vo.getName(),vo.getAddr(),vo.getNum());
		return n;
	}
	public List<MembersVo> list(){
		String sql="select * from members1";
		RowMapper<MembersVo> rowMapper=new RowMapper<MembersVo>() {
			//select�� ��ȸ�� ����� ��� vo�� ������ ����
			@Override
			public MembersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MembersVo vo=new MembersVo();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setPhone(rs.getString("phone"));
				vo.setAddr(rs.getString("addr"));
				vo.setRegdate(rs.getDate("regdate"));
				return vo;
			}
		};
		List<MembersVo> list=jdbcTemplate.query(sql, rowMapper);//rowMapper�� �������̽��� ������ȸ����� ��Գ�Ÿ�������� �����ؾ� ��
		return list;
	}
	public MembersVo getinfo(int num) {
		try {
				String sql="select * from members1 where num=?";
				MembersVo vo=jdbcTemplate.queryForObject(sql,new RowMapper<MembersVo>() {
					//select�� ��ȸ�� ����� ��� vo�� ������ ����
					@Override
					public MembersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
						MembersVo vo=new MembersVo();
						vo.setNum(rs.getInt("num"));
						vo.setName(rs.getString("name"));
						vo.setPhone(rs.getString("phone"));
						vo.setAddr(rs.getString("addr"));
						vo.setRegdate(rs.getDate("regdate"));
						return vo;
					}
				}, num);
				return vo;
		}catch(EmptyResultDataAccessException e) {
				System.out.println(e.getMessage());
				return null;
		}
	}
	public List<MembersVo> getInfoByName(String name) {
		try {
			String sql="select * from members1 where name like '%'||?||'%'";
			List<MembersVo> vo=jdbcTemplate.query(sql,new RowMapper<MembersVo>() {
				@Override
				public MembersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
					MembersVo vo=new MembersVo();
					vo.setNum(rs.getInt("num"));
					vo.setName(rs.getString("name"));
					vo.setPhone(rs.getString("phone"));
					vo.setAddr(rs.getString("addr"));
					vo.setRegdate(rs.getDate("regdate"));
					return vo;
				}
			}, name);
			return  vo;
		}catch(EmptyResultDataAccessException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
