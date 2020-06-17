package com.jhta.spring13.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhta.spring13.VO.CommentsVo;
import com.jhta.spring13.dao.CommentsDAO;

@Service
public class CommentsService {
	
	@Autowired
	private CommentsDAO dao;
	
	public int insert(CommentsVo vo) {
		return dao.insert(vo);
	}
	public List<CommentsVo> list(HashMap<String , Object> map){
		return dao.list(map);
	}
	public int count(int mnum) {
		return dao.count(mnum);
	}
	public int delete(int num) {
		return dao.delete(num);
	}
	public int update(CommentsVo vo) {
		return dao.update(vo);
	}
	public CommentsVo getinfo(int num) {
		return dao.getinfo(num);
	}
}
