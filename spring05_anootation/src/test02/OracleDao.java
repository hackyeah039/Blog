package test02;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDao{
	
	public void insert(String data) {
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
