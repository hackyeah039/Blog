package com.jhta.spring16.dao;

public class MembersDAOImpl implements MembersDAO {

	@Override
	public int insert(Object data) {
		System.out.println(data +"추가완료!");
		return 1;
	}

	@Override
	public int delete(Object data) {
		System.out.println(data +"삭제완료!");
		return 1;
	}

	@Override
	public int update(Object data) {
		System.out.println(data +"수정완료!");
		return 1;
	}

	@Override
	public Object select(Object data) {
		System.out.println(data +"선택완료!");
		return data;
	}

	
}
