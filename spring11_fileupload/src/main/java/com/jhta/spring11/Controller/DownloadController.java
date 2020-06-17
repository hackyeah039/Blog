package com.jhta.spring11.Controller;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jhta.spring11.service.FileinfoService;
import com.jhta.spring11.vo.FileinfoVo;

@Controller
public class DownloadController {

		@Autowired
		private FileinfoService service;
		
		@GetMapping("/download")
		public String download (int filenum,Model model,HttpSession session) {
			FileinfoVo vo=service.getinfo(filenum);//다운로드할 파일정보를 갖는 객체얻어오기
			String path=session.getServletContext().getRealPath("/resources/upload");
			File f=new File(path+File.separator+vo.getSavefilename());//다운로드할 파일객체
			String filename=vo.getOrgfilename();//다운로드창에 보여질 파일명
			model.addAttribute("file", f);
			model.addAttribute("filename",filename);
			model.addAttribute("filesize",vo.getFilesize());
			return "filedownloadView";// 만약 servletContext가 ㅇ벗으면 당연히 jsp로 가지만 , 지금 Bean을 추가했으니깐 그걸 찾으러간다. 그렇게 세팅하기 위해서  viewResolver를 추가한다.
		}
}
