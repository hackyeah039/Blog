package com.jhta.spring08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/") //http://localhost:9090/spring08/ 
	// �̰� �갡 �ٷ� ������ ��
	public String goHome() {
		return "main"; 
		//�Ʊ�� �̸��� ��Ƽ� ���´µ� ������ �׳� String�� return�ϸ� �̰� ���̸��̶��
		//�νĵǾ ���̸��� ��Ƽ� ������Ʈ�ΰ�
	}
}
