package test03.di;

public class OracleDao implements CommonsDao{
	private String dbserver;
	public void setDbserver(String dbserver) {
		this.dbserver = dbserver;
	}
	public String getDbserver() {
		return dbserver;
	}
	public void insert(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]추가하기");
	}
	public void update(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]수정하기");
	}
	public void delete(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]삭제하기");
	}
	public void select(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]조회하기");
	}
}
