package com.jhta.spring20.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhta.spring20.dao.MembersDao;
import com.jhta.spring20.dao.PointsDao;
import com.jhta.spring20.vo.MembersVo;
import com.jhta.spring20.vo.PointsVo;
@Service
public class MembersServiceImpl implements MembersService{
	@Autowired
	private MembersDao membersDao;
	@Autowired
	private PointsDao pointsDao;
	@Transactional
	@Override
	public int insert(Object data) {
		MembersVo mvo = (MembersVo)data;
		PointsVo pvo=new PointsVo(0,mvo.getNum(),100000000,null);
		membersDao.insert(mvo);//ȸ�����̺� �߰�
		pointsDao.insert(pvo);//����Ʈ���̺� �߰�
		return 1;
	}
	@Override
	public int delete(Object data) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(Object data) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Object select(Object data) {
		// TODO Auto-generated method stub
		return null;
	}
}
