package com.jhta.page.util;

public class PageUtil {
	private int pageNum;//페이지넘버
	private int totalRowCount;//전체행갯수
	private int pagesPerPage;//보여지는 페이지갯수
	private int rowsPerPage;//보여지는 행갯수
	private int startRow;//페이지에서 시작행
	private int endRow;//페이지에서 끝행
	private int startPageNum;//페이지에서 시작페이지
	private int endPageNum;//페이지에서 끝페이지
	private int totalPageCount;
	
	public PageUtil() {};
	public PageUtil(int pageNum,int totalRowCount,int pagesPerPage,int rowsPerPage) { //페이지넘버,페이지당글갯수,페이지당페이지갯수,count()결과값
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
