package test01;

import org.springframework.stereotype.Repository;

@Repository
public class MembersDao {
	public MembersDao() {};
	
	public void insert(String data) {
		System.out.println(data +" �߰��Ϸ�!");
	}
	public void delete(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void update(String data) {
		System.out.println(data +" �����Ϸ�!");
	}
	public void select(String data) {
		System.out.println(data +" ��ȸ�Ϸ�!");
	}
	
}
