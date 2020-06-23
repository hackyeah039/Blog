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
	@Autowired private WebApplicationContext ctx; //applicationcontext는 얘로 받아옴
	private MockMvc mockMvc;
	@Before //절차지향XX, 메소드끼리만 있어서 객체지향이다. 
	public void setUp() {// 이건 컨트롤러 Test이니깐 
		mockMvc=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	@Test
	public void insert() throws Exception{
			//perform메소드를 통해 dispatcher servlet으로 요청을 보냄
			mockMvc.perform(post("/insertOk") //post방식으로 보냄, URL
					.param("num","103") //파라미터 정보들 넘김
					.param("name","lee")
					.param("phone","010")
					.param("addr","seoul")) //이정보를  DS가 받아서 처리함
			.andExpect(status().isOk())  //정상적으로 처리됐다면
			.andExpect(forwardedUrl("/WEB-INF/views/result.jsp")); //여기로 가라
	}
}
