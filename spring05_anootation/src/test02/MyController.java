package test02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value = "con")
public class MyController {
	@Autowired
	private MyService service;
	public void setService(MyService service) {
		this.service = service;
	}
	public void execute() {
		service.insert("ȫ�浿1");
		service.update("ȫ�浿2");
		service.delete("ȫ�浿3");
	}
}
