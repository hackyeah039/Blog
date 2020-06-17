package com.jhta.spring11.Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.jhta.spring11.DAO.FileinfoDAO;
import com.jhta.spring11.service.FileinfoService;
import com.jhta.spring11.vo.FileinfoVo;

@Controller
public class FileuploadController {
	@GetMapping("/file/upload")
	public String uploadForm() {
		return "insert";
	}
	@Autowired
	private FileinfoService service;
	
	//MultipartFile file1 :전송된 파일은 MultipartFile 타입객체로 전달받기 -- name 이름도 똑같이 받아와야 함
	@PostMapping("/file/setupload")
	public String uploadSet(String writer,String title,String content,MultipartFile file1,HttpSession session) {
		//업로드할 폴더 경로 얻어오기
		String uploadPath =
					session.getServletContext().getRealPath("/resources/upload");
		System.out.println(uploadPath);
		//파일복사,중복되지않는 이름명 직접-아파치 지원X <==> applicationContext(자동지원)
		
		//전송된 파일명
		String orgfileName=file1.getOriginalFilename();
		//실제 지정할 파일명(중복되지 않도록)
		String savefileName=UUID.randomUUID()+"_"+orgfileName;
		try {
			//전송된 파일을 읽어오는 스트림
			InputStream fis =file1.getInputStream();
			//전송된 파일을 서버에 복사(업로드) 하기위한 출력스트림
			FileOutputStream fos=
					new FileOutputStream(uploadPath+"\\"+ savefileName);
			//파일 복사하기 //스프링 내장객체
			FileCopyUtils.copy(fis,fos);
			fis.close();
			fos.close();
		
			//DB에 파일정보 저장하기..
			long filesize=file1.getSize();
			FileinfoVo vo=new FileinfoVo(0,writer,title,content,orgfileName,savefileName,filesize);
			service.insert(vo);
			return "success";
		}catch(IOException io) {
			System.out.println(io.getMessage());
			return "error";
		}
	}
}
