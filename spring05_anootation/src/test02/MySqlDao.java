package test02;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDao{
	public void insert(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]�߰��ϱ�");
	}

	public void update(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]�����ϱ�");
	}

	public void delete(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]�����ϱ�");
	}

	public void select(Object data) {
		System.out.println("MySql�� �����Ͽ� [" +data +"]��ȸ�ϱ�");
	}
}
