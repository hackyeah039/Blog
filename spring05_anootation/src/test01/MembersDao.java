package test01;

import org.springframework.stereotype.Repository;

@Repository
public class MembersDao {
	public MembersDao() {};
	
	public void insert(String data) {
		System.out.println(data +" 추가완료!");
	}
	public void delete(String data) {
		System.out.println(data +" 삭제완료!");
	}
	public void update(String data) {
		System.out.println(data +" 수정완료!");
	}
	public void select(String data) {
		System.out.println(data +" 조회완료!");
	}
	
}
