package test.service;

import org.springframework.beans.factory.annotation.Autowired;

import test.dao.MembersDao;

public class MembersService {
	//객체 자동주입하기
	@Autowired private MembersDao dao;
	
	public void setDao(MembersDao dao) {
		this.dao=dao;
	}
	
	public void insert(String data) {
		System.out.println("user :" +dao.getUser());
		System.out.println("pwd :" +dao.getPwd());
		dao.insert(data);
	}
	
	public void delete(String data) {
		dao.delete(data);
	}
	
	public void update(String data) {
		dao.update(data);
	}
	
	public void select(String data) {
		dao.select(data);
	}
}
