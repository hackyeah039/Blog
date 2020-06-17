package test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MembersDao {
	@Autowired
	@Qualifier("user")
	private String user;//���Ӱ���(scott)
	@Autowired
	@Qualifier("pwd")
	private String pwd;//���Ӻ�й�ȣ(tiger)
	
	public MembersDao() {};
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void insert(String data) {
		System.out.println(data +" �߰��Ϸ�!");
	}
	public void delete(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void update(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void select(String data) {
		System.out.println(data +" ��ȸ�Ϸ�!");
	}
	
}
