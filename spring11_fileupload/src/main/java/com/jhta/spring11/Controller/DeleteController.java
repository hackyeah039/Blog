package com.jhta.spring11.Controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jhta.spring11.service.FileinfoService;

@Controller
public class DeleteController {

	@Autowired
	private FileinfoService service;
	
	@GetMapping("delete")
	public String delete(int filenum,String savefilename,HttpSession session) {
		int n=service.delete(filenum);
		String uploadPath =
				session.getServletContext().getRealPath("/resources/upload");
		System.out.println(uploadPath+savefilename+"전체주소&이름");
		if(n!=0) {
			File file = new File(uploadPath+"/"+savefilename);
			file.delete();
			return "redirect:file/list";
		}else {
			return "error";
		}
	}
}
