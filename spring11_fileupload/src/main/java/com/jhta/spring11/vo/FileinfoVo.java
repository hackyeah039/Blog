package com.jhta.spring11.vo;
public class FileinfoVo {
	private int filenum;
	private String writer;
	private String title;
	private String content;
	private String orgfilename;
	private String savefilename;
	private long filesize;
	
	public FileinfoVo() {};
	
	public FileinfoVo(int filenum, String writer, String title, String content, String orgfilename, String savefilename,
			long filesize) {
		this.filenum = filenum;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.orgfilename = orgfilename;
		this.savefilename = savefilename;
		this.filesize = filesize;
	}
	
	public int getFilenum() {
		return filenum;
	}
	public void setFilenum(int filenum) {
		this.filenum = filenum;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String wirter) {
		this.writer = wirter;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOrgfilename() {
		return orgfilename;
	}
	public void setOrgfilename(String orgfilename) {
		this.orgfilename = orgfilename;
	}
	public String getSavefilename() {
		return savefilename;
	}
	public void setSavefilename(String savefilename) {
		this.savefilename = savefilename;
	}
	public double getFilesize() {
		return filesize;
	}
	public void setFilesize(long  filesize) {
		this.filesize = filesize;
	}
}
