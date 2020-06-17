package com.jhta.spring11.Controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.jhta.spring11.service.FileinfoService;
import com.jhta.spring11.vo.FileinfoVo;

@Controller
public class UpdateController {
	
	@Autowired
	private FileinfoService service;
	
	@GetMapping("/update")
	public String update(int filenum,Model model) {
		model.addAttribute("filenum",filenum);
		return "update";
	}
	@PostMapping("/realupdate")
	public String setUpdate(FileinfoVo vo,HttpSession session,MultipartFile file1,int filenum) {
			FileinfoVo vo1=service.getinfo(filenum);
			int n=service.delete(filenum);
			if(n!=0) {
				//savefilenum
				String savefilename=vo1.getSavefilename();
				String uploadPath =
						session.getServletContext().getRealPath("/resources/upload");
						//파일삭제
						File file = new File(uploadPath+"/"+savefilename);
						file.delete();
						
						//파일 다시넣기
						InputStream fis;
						String orgfileName1=file1.getOriginalFilename();
						String savefileName1=UUID.randomUUID()+"_"+orgfileName1;
						
						try {
						fis = file1.getInputStream();
						FileOutputStream fos=
								new FileOutputStream(uploadPath+"\\"+ savefileName1);
						FileCopyUtils.copy(fis,fos);
						fis.close();
						fos.close();
						
						long filesize=file1.getSize();
						FileinfoVo vo2=new FileinfoVo(0,vo.getWriter(),vo.getTitle(),vo.getContent(),orgfileName1,savefileName1,filesize);
						service.insert(vo2);
						return "redirect:file/list";
					}catch(IOException e) {
						System.out.println(e.getMessage());
						return "error";
					}
			}else {
				return "error";
			}
	}
}
