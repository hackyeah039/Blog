package test.dao;

public class OracleDao implements CommonsDao {
	private String dbserver;

	public void setDbserver(String dbserver) {
		this.dbserver = dbserver;
	}

	public String getDbserver() {
		return dbserver;
	}

	public void insert(Object data) {
		Long current=System.currentTimeMillis();
		for (int i = 1; i <= 10000000; i++) {
			for (int j = 1; j <= 100000000; j++)
				;
		}
		for (int i = 1; i <= 10000000; i++) {
			for (int j = 1; j <= 100000000; j++)
				;
		}
		for (int i = 1; i <= 1000000000; i++) {
			for (int j = 1; j <= 100000000; j++)
				;
		}
		for (int i = 1; i <= 10000000; i++) {
			for (int j = 1; j <= 100000000; j++)
				;
		}
		System.out.println("����Ŭ�� �����Ͽ� [" + data + "]�߰��ϱ�");
		System.out.println(System.currentTimeMillis()-current +"�۾��ð�"); 
	}

	public void update(Object data) {
		Long current=System.currentTimeMillis();
		for (int i = 1; i <= 1000000000; i++) {
			for (int j = 1; j <= 100000000; j++)
				;
		}
		System.out.println("����Ŭ�� �����Ͽ� [" + data + "]�����ϱ�");
		System.out.println(System.currentTimeMillis()-current +"�۾��ð�");
	}

	public void delete(Object data) {
		Long current=System.currentTimeMillis();
		for (int i = 1; i <= 1000000; i++) {
			for (int j = 1; j <= 1000000; j++)
				;
		}
		System.out.println("����Ŭ�� �����Ͽ� [" + data + "]�����ϱ�");
		System.out.println(System.currentTimeMillis()-current +"�۾��ð�");
	}

	public void select(Object data) {
		Long current=System.currentTimeMillis();
		for (int i = 1; i <= 10000000; i++) {
			for (int j = 1; j <= 1000000; j++)
				;
		}
		System.out.println("����Ŭ�� �����Ͽ� [" + data + "]��ȸ�ϱ�");
		System.out.println(System.currentTimeMillis()-current +"�۾��ð�");
	}
}
