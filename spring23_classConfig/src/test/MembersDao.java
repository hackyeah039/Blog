package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//MembersDao객체를 생성후 main메소드에서 사용해보세요
public class MembersDao {
	private String user;//접속계정(scott)
	private String pwd;//접속비밀번호(tiger)
	public MembersDao() {};
	public MembersDao(String user,String pwd) {
		this.user=user;
		this.pwd=pwd;
	}
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
		System.out.println(data +" 추가완료!");
	}
	public void delete(String data) {
		System.out.println(data +" 삭제완료!");
	}
	public void update(String data) {
		System.out.println(data +" 수정완료!");
	}
	public void select(String data) {
		System.out.println(data +" 조회완료!");
	}
	
}
