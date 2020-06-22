package com.jhta.test.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.test.DAO.GongiDAO;
import com.jhta.test.VO.Gongivo;

@Service
public class GongiService {

	@Autowired
	private GongiDAO dao;
	
	public int insert(Gongivo vo) {
		return dao.insert(vo);
	}
	public int count(HashMap<String, Object> map) {
		return dao.count(map);
	}
	public List<Gongivo> list(HashMap<String, Object> map){
		return dao.list(map);
	}
	public int delete(int num) {
		return dao.delete(num);
	}
}
