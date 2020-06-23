package com.jhta.page.util;

public class PageUtil {
	private int pageNum;//��������ȣ-��
	private int startRow;//������-��
	private int endRow;//����-��
	private int totalPageCount;//��ü������ ����-��
	private int startPageNum;//���������� ����-��
	private int endPageNum;//�������� ����-��
	private int rowBlockCount;//���������� ������ ���� ����-��
	private int pageBlockCount;//���������� ������ �������� ����-��
	private int totalRowCount;//��ü ���� ����-��
	public PageUtil() {};
	public PageUtil(int pageNum,int totalRowCount ,int rowBlockCount, int pageBlockCount) {
		this.pageNum = pageNum;
//		System.out.println(pageNum+"pageNum");
		this.rowBlockCount = rowBlockCount;
//		System.out.println(rowBlockCount+"rowBlockCount");
		this.pageBlockCount = pageBlockCount;
//		System.out.println(pageBlockCount+"pageBlockCount");
		this.totalRowCount = totalRowCount;
//		System.out.println(totalRowCount+"totalRowCount");
		startRow=(pageNum-1)*rowBlockCount+1;
//		System.out.println(startRow+"startRow");
		endRow=startRow+rowBlockCount-1;
//		System.out.println(endRow+"endRow");
		totalPageCount=(int)Math.ceil(totalRowCount/(double)rowBlockCount);
//		System.out.println(totalPageCount+"totalPageCount");
		startPageNum=(pageNum-1)/pageBlockCount*pageBlockCount+1;
//		System.out.println(startPageNum+"startPageNum");
		endPageNum=startPageNum+pageBlockCount-1;
//		System.out.println(endPageNum+"endPageNum");
		if(totalPageCount<endPageNum) {
			endPageNum=totalPageCount;
		}
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getEndRow() {
		return endRow;
	}
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
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
	public int getRowBlockCount() {
		return rowBlockCount;
	}
	public void setRowBlockCount(int rowBlockCount) {
		this.rowBlockCount = rowBlockCount;
	}
	public int getPageBlockCount() {
		return pageBlockCount;
	}
	public void setPageBlockCount(int pageBlockCount) {
		this.pageBlockCount = pageBlockCount;
	}
	public int getTotalRowCount() {
		return totalRowCount;
	}
	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}
	
}
