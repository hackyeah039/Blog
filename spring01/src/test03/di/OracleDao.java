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
		System.out.println("����Ŭ�� �����Ͽ� [" +data +"]�߰��ϱ�");
	}
	public void update(Object data) {
		System.out.println("����Ŭ�� �����Ͽ� [" +data +"]�����ϱ�");
	}
	public void delete(Object data) {
		System.out.println("����Ŭ�� �����Ͽ� [" +data +"]�����ϱ�");
	}
	public void select(Object data) {
		System.out.println("����Ŭ�� �����Ͽ� [" +data +"]��ȸ�ϱ�");
	}
}
