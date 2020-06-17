package com.jhta.spring11.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.spring11.DAO.FileinfoDAO;
import com.jhta.spring11.vo.FileinfoVo;

@Service
public class FileinfoService {
	
	@Autowired
	private FileinfoDAO dao;
	
	public int insert(FileinfoVo vo) {
		return dao.insert(vo);
	}
	public List<FileinfoVo> list(HashMap<String, Object> map){
		return dao.list(map);
	}
	public int count(HashMap<String, Object> map) {
		return dao.count(map);
	}
	public int delete(int filenum) {
		return dao.delete(filenum);
	}
	public int update(FileinfoVo vo) {
		return dao.update(vo);
	}
	public FileinfoVo getinfo(int filenum) {
		return dao.getlist(filenum);
	}
}
