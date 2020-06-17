package test02;

import org.springframework.stereotype.Repository;

@Repository
public class OracleDao{
	
	public void insert(String data) {
		System.out.println("오라클과 연동하여 [" +data +"]추가하기");
	}
	
	public void update(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]수정하기");
	}
	
	public void delete(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]삭제하기");
	}
	
	public void select(Object data) {
		System.out.println("오라클과 연동하여 [" +data +"]조회하기");
	}
}
