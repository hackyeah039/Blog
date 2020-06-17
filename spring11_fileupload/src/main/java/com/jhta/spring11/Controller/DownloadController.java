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
			FileinfoVo vo=service.getinfo(filenum);//�ٿ�ε��� ���������� ���� ��ü������
			String path=session.getServletContext().getRealPath("/resources/upload");
			File f=new File(path+File.separator+vo.getSavefilename());//�ٿ�ε��� ���ϰ�ü
			String filename=vo.getOrgfilename();//�ٿ�ε�â�� ������ ���ϸ�
			model.addAttribute("file", f);
			model.addAttribute("filename",filename);
			model.addAttribute("filesize",vo.getFilesize());
			return "filedownloadView";// ���� servletContext�� �������� �翬�� jsp�� ������ , ���� Bean�� �߰������ϱ� �װ� ã��������. �׷��� �����ϱ� ���ؼ�  viewResolver�� �߰��Ѵ�.
		}
}
