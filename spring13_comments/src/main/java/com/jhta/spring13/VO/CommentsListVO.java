package com.jhta.spring13.VO;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="commentsList")
@XmlAccessorType(XmlAccessType.FIELD)
public class CommentsListVO {
	private List<CommentsVo> list;
	private int startPageNum;
	private int endPageNum;
	private int pageCount;
	private int mnum;
	public List<CommentsVo> getList() {
		return list;
	}
	public void setList(List<CommentsVo> list) {
		this.list = list;
	}
	public int getStartPageNum() {
		return startPageNum;
	}
	public void setStartPageNum(int startPageNum) {
		this.startPageNum = startPageNum;
	}
	public int getEndPageNum() {
		return endPageNum;
	}
	public void setEndPageNum(int endPageNum) {
		this.endPageNum = endPageNum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getMnum() {
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	
}
