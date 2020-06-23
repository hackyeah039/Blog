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
//service�о�������ؼ� 
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml") 
public class MembersTest {
	@Autowired private MembersService service;
	
	//�޼ҵ�� �ϳ��ϳ� �׽�Ʈ
	@Test //�̰� �׽�Ʈ �ϰڴ�.
	public void insert() {
		int n=service.insert(new MembersVo(123,"�̾�","000","����",null));
		assertEquals(1, n); //1,n �� ��ġ�ϸ� true��ȯ
	};
	@Test
	public void getinfo() {
		MembersVo vo=service.selectOne(113);
		//vo�� null���� �˻�
		assertNotNull(vo);
	}
}
