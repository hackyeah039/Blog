package com.jhta.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/") //http://localhost:9090/spring08/ 
	// 이건 얘가 바로 실행이 됨
	public String goHome() {
		return "main"; 
		//아까는 이름을 담아서 보냈는데 지금은 그냥 String을 return하면 이게 뷰이름이라고
		//인식되어서 뷰이름을 담아서 프로젝트로감
	}
}
