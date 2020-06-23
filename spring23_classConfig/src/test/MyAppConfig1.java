package test;

import javax.sql.DataSource; 

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import test.dao.MembersDao;
@Configuration
public class MyAppConfig1 {
	@Bean(name="membersDao")
	public MembersDao dao() {
		MembersDao dao=new MembersDao();
		dao.setDataSource(getDataSource());
		return dao;
	}
	public DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("scott");
		ds.setPassword("tiger");
		return ds;
	}
}
