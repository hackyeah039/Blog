package test04.quiz;

public class JDBCDao implements CommonDao{
	public void init() {//초기화할때
		System.out.println("jdbc를 사용하기 위한 초기화 작업 수행!");
	}
	public void destroy() {//더이상 사용되징낳을때 --여기에서
		System.out.println("jdbc를 종료하기 위한 초기화 작업 수행!");
	}
	private String dbserver;
	public void setDbserver(String dbserver) {
		this.dbserver = dbserver;
	}
	public String getDbserver() {
		return dbserver;
	}

	@Override
	public void insert(Object data) {
		System.out.println(dbserver+"를 통해서" +data );
	}

	@Override
	public void update(Object data) {
		System.out.println(dbserver+"를 통해서" +data );
	}

	@Override
	public void delete(Object data) {
		System.out.println(dbserver+"를 통해서" +data );
	}

	@Override
	public void select(Object data) {
		System.out.println(dbserver+"를 통해서" +data );
	}
	
}
