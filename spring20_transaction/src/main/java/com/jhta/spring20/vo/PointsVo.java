package com.jhta.spring20.vo;

import java.util.Date;

public class PointsVo {
	private int pnum;
	private int num;
	private int point;
	private Date regdate;
	
	public PointsVo() {};
	public PointsVo(int pnum, int num, int point, Date regdate) {
		super();
		this.pnum = pnum;
		this.num = num;
		this.point = point;
		this.regdate = regdate;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
