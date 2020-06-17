package test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {
	//객체 자동주입하기
	@Autowired private MembersDao dao;
	
	public void setDao(MembersDao dao) {
		this.dao=dao;
	}
	
	public void insert(String data) {
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
