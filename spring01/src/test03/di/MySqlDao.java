package test03.di;

public class MySqlDao implements CommonsDao{
	private String dbserver;
	@Override
	public void setDbserver(String dbserver) {
		this.dbserver=dbserver;
	}

	@Override
	public String getDbserver() {
		return dbserver;
	}

	@Override
	public void insert(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]추가하기");
	}

	@Override
	public void update(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]수정하기");
	}

	@Override
	public void delete(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]삭제하기");
	}

	@Override
	public void select(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]조회하기");
	}
}
