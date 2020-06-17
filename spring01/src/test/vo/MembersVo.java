package test.vo;

import java.sql.Date;

public class MembersVo {
	private int num;
	private String name;
	private String phone;
	private String addr;
	private Date regdate;
	public MembersVo() {}
	public MembersVo(int num, String name, String phone, String addr, Date regdate) {
		super();
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.addr = addr;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}









