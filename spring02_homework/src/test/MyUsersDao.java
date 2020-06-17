package test;

import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class MyUsersDao {
	//ID          VARCHAR2(20) 
	//PWD         VARCHAR2(20) 
	//EMAIL       VARCHAR2(20) 
	//MAKEDATE    DATE         
	private JdbcTemplate jdbcTemplate;
	public MyUsersDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public int insert(MyUsersVo vo) {
		String sql="insert into myusers values(?,?,?,sysdate)";
		int n=jdbcTemplate.update(sql,vo.getId(),vo.getPwd(),vo.getEmail());
		return n;
	}
	public int delete(String id) {
		String sql="delete from myusers where id=?";
		int n=jdbcTemplate.update(sql,id);
		return n;
	}
	public int update(MyUsersVo vo) {
		String sql="update myusers set pwd=?,email=? where id=?";
		int n=jdbcTemplate.update(sql,vo.getPwd(),vo.getEmail(),vo.getId());
		return n;
	}
	
	public List<MyUsersVo> list(){
		String sql="select * from myusers";
		RowMapper<MyUsersVo> rowMapper=new RowMapper<MyUsersVo>() {
			//select로 조회된 결과를 어떻게 vo에 담을지 설정
			@Override
			public MyUsersVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MyUsersVo vo=new MyUsersVo();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setPwd(rs.getString("pwd"));
				vo.setMakedate(rs.getDate("makedate"));
				return vo;
			}
		};
		List<MyUsersVo> list=jdbcTemplate.query(sql, rowMapper);//rowMapper는 인터페이스임 셀렉조회결과를 어떻게나타낼건지를 설정해야 함
		return list;
	}
}
