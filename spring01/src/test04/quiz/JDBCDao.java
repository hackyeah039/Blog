package test04.quiz;

public class JDBCDao implements CommonDao{
	public void init() {//�ʱ�ȭ�Ҷ�
		System.out.println("jdbc�� ����ϱ� ���� �ʱ�ȭ �۾� ����!");
	}
	public void destroy() {//���̻� ����¡������ --���⿡��
		System.out.println("jdbc�� �����ϱ� ���� �ʱ�ȭ �۾� ����!");
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
		System.out.println(dbserver+"�� ���ؼ�" +data );
	}

	@Override
	public void update(Object data) {
		System.out.println(dbserver+"�� ���ؼ�" +data );
	}

	@Override
	public void delete(Object data) {
		System.out.println(dbserver+"�� ���ؼ�" +data );
	}

	@Override
	public void select(Object data) {
		System.out.println(dbserver+"�� ���ؼ�" +data );
	}
	
}
