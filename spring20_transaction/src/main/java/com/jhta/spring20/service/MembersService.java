package com.jhta.spring20.service;

public interface MembersService {
	int insert(Object data);
	int delete(Object data);
	int update(Object data);
	Object select(Object data);
}
