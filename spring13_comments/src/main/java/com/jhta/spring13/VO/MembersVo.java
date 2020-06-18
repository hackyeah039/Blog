package com.jhta.spring13.VO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes; 


public class MembersVo {
	private int m_num;
	private String m_name;
	private String m_phone;
	private String m_addr;
	private String m_email;
	@JsonFormat(shape=Shape.STRING,
			pattern = "yyyy-mm-dd",timezone = "Asia/Seoul")
	private Date m_regdate;
	public MembersVo() {}
	public MembersVo(int m_num, String m_name, String m_phone, String m_addr, String m_email, Date m_regdate) {
		super();
		this.m_num = m_num;
		this.m_name = m_name;
		this.m_phone = m_phone;
		this.m_addr = m_addr;
		this.m_email = m_email;
		this.m_regdate = m_regdate;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public Date getM_regdate() {
		return m_regdate;
	}
	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}
	
}









