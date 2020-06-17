package test05.jdbc;
/*
 * Spring에서는 jdbc작업을 할때 JDBc의 반복되는 작업을 템플릿화한
 * JDBCTemplate을 사용한다 
 */

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import test.vo.MembersVo;


import test.vo.MembersVo;
//Dao<=JdbcTemplate <=dataSource(Url,user,connectionPool정보 포함함)
public class MembersDao {
	private JdbcTemplate jdbcTemplate;
	//스프링 생성한걸 받아와야하니 (생성자,세터 둘중하나로 받아야 함)
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(MembersVo vo) { //예전에 JDBC랑 연결했던 부분들은 Spring이 다해주고, 우리는 쿼리문같이 변동성있는 부분에 집중!
		String sql="insert into members1 values(?,?,?,?,sysdate)";
		//jdbcTemplate.update(실행할sql구문,?에 대응되는 값들)
		int n=jdbcTemplate.update(sql,vo.getNum(),vo.getName(),vo.getPhone(),vo.getAddr());
		//(String sql,Object... args)==가변형인자, 얼마든지 값을 넣을수있다. 파라미터값들을 배열로 저장해서 얼마든지 넣어도 됨 
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
			//select로 조회된 결과를 어떻게 vo에 담을지 설정
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
		List<MembersVo> list=jdbcTemplate.query(sql, rowMapper);//rowMapper는 인터페이스임 셀렉조회결과를 어떻게나타낼건지를 설정해야 함
		return list;
	}
	public MembersVo getinfo(int num) {
		try {
				String sql="select * from members1 where num=?";
				MembersVo vo=jdbcTemplate.queryForObject(sql,new RowMapper<MembersVo>() {
					//select로 조회된 결과를 어떻게 vo에 담을지 설정
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
