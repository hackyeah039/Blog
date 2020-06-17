package test02;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlDao{
	public void insert(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]추가하기");
	}

	public void update(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]수정하기");
	}

	public void delete(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]삭제하기");
	}

	public void select(Object data) {
		System.out.println("MySql과 연동하여 [" +data +"]조회하기");
	}
}
