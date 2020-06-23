package com.jhta.spring08;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml",
"classpath:appServlet-servlet.xml"})
@WebAppConfiguration
public class MembersTest1 {
	@Autowired private WebApplicationContext ctx; //applicationcontext�� ��� �޾ƿ�
	private MockMvc mockMvc;
	@Before //��������XX, �޼ҵ峢���� �־ ��ü�����̴�. 
	public void setUp() {// �̰� ��Ʈ�ѷ� Test�̴ϱ� 
		mockMvc=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	@Test
	public void insert() throws Exception{
			//perform�޼ҵ带 ���� dispatcher servlet���� ��û�� ����
			mockMvc.perform(post("/insertOk") //post������� ����, URL
					.param("num","103") //�Ķ���� ������ �ѱ�
					.param("name","lee")
					.param("phone","010")
					.param("addr","seoul")) //��������  DS�� �޾Ƽ� ó����
			.andExpect(status().isOk())  //���������� ó���ƴٸ�
			.andExpect(forwardedUrl("/WEB-INF/views/result.jsp")); //����� ����
	}
}
