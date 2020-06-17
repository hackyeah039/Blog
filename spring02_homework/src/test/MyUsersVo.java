package test;

import java.sql.Date;

public class MyUsersVo {
	private String id;
	private String pwd;
	private String email;
	private Date makedate;
	
	public MyUsersVo() {};
	public MyUsersVo(String id,String pwd,String email,Date makedate) {
		this.id=id;
		this.pwd=pwd;
		this.email=email;
		this.makedate=makedate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getMakedate() {
		return makedate;
	}
	public void setMakedate(Date makedate) {
		this.makedate = makedate;
	}
	
}
