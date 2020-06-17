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
		System.out.println("MySql�� �����Ͽ� [" +data +"]�߰��ϱ�");
	}

	@Override
	public void update(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]�����ϱ�");
	}

	@Override
	public void delete(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]�����ϱ�");
	}

	@Override
	public void select(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]��ȸ�ϱ�");
	}
}
