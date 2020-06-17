package com.jhta.spring10.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.spring10.dao.BoardDAO;
import com.jhta.spring10.vo.BoardVo;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}
	public int insert(BoardVo vo) {
		return dao.insert(vo);
	}
	public int count(HashMap<String, Object> map) {
		return dao.count(map);
	}
	public List<BoardVo> list(HashMap<String, Object> map){
		return dao.list(map);
	}
	public BoardVo next(int num) {
		return dao.next(num);
	}
	public BoardVo prev(int num) {
		return dao.prev(num);
	}
	public BoardVo detail(int num) {
		return dao.detail(num);
	}
	public int addHit(int num) {
		return dao.addHit(num);
	}
	public List<BoardVo> recent(){
		return dao.recent();
	}
	public int delete(int num) {
		return dao.delete(num);
	}
	public int update(BoardVo vo) {
		return dao.update(vo);
	}
}
