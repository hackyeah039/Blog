package com.jhta.spring16.dao;

public interface MembersDAO {
	int insert(Object data);
	int delete(Object data);
	int update(Object data);
	Object select(Object data);
}
