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
	
	//MultipartFile file1 :���۵� ������ MultipartFile Ÿ�԰�ü�� ���޹ޱ� -- name �̸��� �Ȱ��� �޾ƿ;� ��
	@PostMapping("/file/setupload")
	public String uploadSet(String writer,String title,String content,MultipartFile file1,HttpSession session) {
		//���ε��� ���� ��� ������
		String uploadPath =
					session.getServletContext().getRealPath("/resources/upload");
		System.out.println(uploadPath);
		//���Ϻ���,�ߺ������ʴ� �̸��� ����-����ġ ����X <==> applicationContext(�ڵ�����)
		
		//���۵� ���ϸ�
		String orgfileName=file1.getOriginalFilename();
		//���� ������ ���ϸ�(�ߺ����� �ʵ���)
		String savefileName=UUID.randomUUID()+"_"+orgfileName;
		try {
			//���۵� ������ �о���� ��Ʈ��
			InputStream fis =file1.getInputStream();
			//���۵� ������ ������ ����(���ε�) �ϱ����� ��½�Ʈ��
			FileOutputStream fos=
					new FileOutputStream(uploadPath+"\\"+ savefileName);
			//���� �����ϱ� //������ ���尴ü
			FileCopyUtils.copy(fis,fos);
			fis.close();
			fos.close();
		
			//DB�� �������� �����ϱ�..
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
