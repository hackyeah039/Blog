package com.jhta.page.util;

public class PageUtil {
	private int pageNum;//�������ѹ�
	private int totalRowCount;//��ü�హ��
	private int pagesPerPage;//�������� ����������
	private int rowsPerPage;//�������� �హ��
	private int startRow;//���������� ������
	private int endRow;//���������� ����
	private int startPageNum;//���������� ����������
	private int endPageNum;//���������� ��������
	private int totalPageCount;
	
	public PageUtil() {};
	public PageUtil(int pageNum,int totalRowCount,int pagesPerPage,int rowsPerPage) { //�������ѹ�,��������۰���,������������������,count()�����
		this.pageNum=pageNum;
		this.totalRowCount=totalRowCount;
		this.pagesPerPage=pagesPerPage;
		this.rowsPerPage=rowsPerPage;
		startRow=(pageNum-1)*rowsPerPage+1;
		startPageNum=(pageNum-1)/pagesPerPage+1;
		endRow=startRow+rowsPerPage-1;
		endPageNum=startPageNum+pagesPerPage-1;
		totalPageCount=(int)Math.ceil(totalRowCount/(double)pagesPerPage);
		if(totalPageCount<endPageNum) endPageNum=totalPageCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getTotalRowCount() {
		return totalRowCount;
	}
	public void setTotalRowCount(int totalRowCount) {
		this.totalRowCount = totalRowCount;
	}
	public int getPagesPerPage() {
		return pagesPerPage;
	}
	public void setPagesPerPage(int pagesPerPage) {
		this.pagesPerPage = pagesPerPage;
	}
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
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
	
	
}
