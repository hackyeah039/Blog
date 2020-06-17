package vo;

import java.sql.Date;

public class MyBoardVo {
	private int num;
	private String writer;
	private String pwd;
	private String title;
	private String content;
	private Date regdate;
	public MyBoardVo() {};
	public MyBoardVo(int num, String writer, String pwd, String title, String content, Date regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.pwd = pwd;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
