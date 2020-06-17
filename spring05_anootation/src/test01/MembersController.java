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
		service.insert("이길동");
		service.update("이길동");
		service.select("이길동");
		service.delete("이길동");
	}
}
