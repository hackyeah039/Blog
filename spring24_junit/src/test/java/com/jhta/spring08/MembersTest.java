package com.jhta.spring08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.service.MembersService;
import test.vo.MembersVo;

@RunWith(SpringJUnit4ClassRunner.class)
//service읽어오기위해서 
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml") 
public class MembersTest {
	@Autowired private MembersService service;
	
	//메소드들 하나하나 테스트
	@Test //이걸 테스트 하겠다.
	public void insert() {
		int n=service.insert(new MembersVo(123,"이씨","000","서울",null));
		assertEquals(1, n); //1,n 이 일치하면 true반환
	};
	@Test
	public void getinfo() {
		MembersVo vo=service.selectOne(113);
		//vo가 null인지 검사
		assertNotNull(vo);
	}
}
