package com.jhta.spring11.view;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

/*
 * 	커스텀뷰 만들기->사용자가 직접 만든뷰
 * AbstractView를 상속받아 만든다.
 * */
public class DownloadView extends AbstractView { // 각자맞는 확장자에 대한 인터페이스 상속받아서

	@Override // 이 안에 그에맞는 코드를 짜주면된다. //
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 파라미터 -컨트롤러에서 보내온 모델객체, 요청,응답
		// jsp에서의 다운로드 기능과 비슷하다.
		// 1.다운로드 창으로 응답하기
		super.setContentType("application/octet-stream");// 텍스트형태 HTML 해석할수없는 타입이라고 해서 다운로드창이열린다.
		File f = (File) model.get("file");
		String filename = (String) model.get("filename");
		Long fileSize = (Long)((model.get("filesize")));// 3개가 보내준 컨트롤러의 모델에서의 속성이름과 같아야한다.
		response.setContentType(getContentType());
		response.setContentLength(fileSize.intValue());
		// 여기까지하면 다운로드 명을 한글로하면 깨짐, 그래서 안깨지게 인코딩을 해줘야한다.
		// 다운로드창에 파일명이 한글인 경우 한글이 꺠지지 않도록 인코딩 설정
		filename = URLEncoder.encode(filename, "utf-8");// 파일이름을 인코딩하라는것 근데 이걸하면 공백같은것 '자바 10.'=>'자바+10'이렇게 바뀜
		filename = filename.replaceAll("\\+", "%20");// 그래서 공백문자를 바꾸라는 것이다. 더하기는 정규표시에 기능이 있는거라서 =>\\두번쓰고 +해주면가능
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);// 다운로드 해더창에 보이게ㅐ되는것
		// 2.실제로 다운로드 하기(클라이언트에 파일복사하기)
		OutputStream os = response.getOutputStream();// 클라이언트가 os타고 보내는것,
		FileInputStream fis = new FileInputStream(f);// os타고 모델객체를 담은 file(f)를 보낸다.//is는 받는것
		FileCopyUtils.copy(fis, os);//
		fis.close();
		os.close();

		// 3.
	}

}
