package test01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 

@Controller(value="mController")
public class MembersController {
	@Autowired private MembersService service;
	public void setService(MembersService service) {
		this.service=service;
	}
	public void execute() {
		service.insert("�̱浿");
		service.update("�̱浿");
		service.select("�̱浿");
		service.delete("�̱浿");
	}
}
