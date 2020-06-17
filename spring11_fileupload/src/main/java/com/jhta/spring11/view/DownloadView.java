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
 * 	Ŀ���Һ� �����->����ڰ� ���� �����
 * AbstractView�� ��ӹ޾� �����.
 * */
public class DownloadView extends AbstractView { // ���ڸ´� Ȯ���ڿ� ���� �������̽� ��ӹ޾Ƽ�

	@Override // �� �ȿ� �׿��´� �ڵ带 ¥�ָ�ȴ�. //
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// �Ķ���� -��Ʈ�ѷ����� ������ �𵨰�ü, ��û,����
		// jsp������ �ٿ�ε� ��ɰ� ����ϴ�.
		// 1.�ٿ�ε� â���� �����ϱ�
		super.setContentType("application/octet-stream");// �ؽ�Ʈ���� HTML �ؼ��Ҽ����� Ÿ���̶�� �ؼ� �ٿ�ε�â�̿�����.
		File f = (File) model.get("file");
		String filename = (String) model.get("filename");
		Long fileSize = (Long)((model.get("filesize")));// 3���� ������ ��Ʈ�ѷ��� �𵨿����� �Ӽ��̸��� ���ƾ��Ѵ�.
		response.setContentType(getContentType());
		response.setContentLength(fileSize.intValue());
		// ��������ϸ� �ٿ�ε� ���� �ѱ۷��ϸ� ����, �׷��� �ȱ����� ���ڵ��� ������Ѵ�.
		// �ٿ�ε�â�� ���ϸ��� �ѱ��� ��� �ѱ��� ������ �ʵ��� ���ڵ� ����
		filename = URLEncoder.encode(filename, "utf-8");// �����̸��� ���ڵ��϶�°� �ٵ� �̰��ϸ� ���鰰���� '�ڹ� 10.'=>'�ڹ�+10'�̷��� �ٲ�
		filename = filename.replaceAll("\\+", "%20");// �׷��� ���鹮�ڸ� �ٲٶ�� ���̴�. ���ϱ�� ����ǥ�ÿ� ����� �ִ°Ŷ� =>\\�ι����� +���ָ鰡��
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);// �ٿ�ε� �ش�â�� ���̰Ԥ��Ǵ°�
		// 2.������ �ٿ�ε� �ϱ�(Ŭ���̾�Ʈ�� ���Ϻ����ϱ�)
		OutputStream os = response.getOutputStream();// Ŭ���̾�Ʈ�� osŸ�� �����°�,
		FileInputStream fis = new FileInputStream(f);// osŸ�� �𵨰�ü�� ���� file(f)�� ������.//is�� �޴°�
		FileCopyUtils.copy(fis, os);//
		fis.close();
		os.close();

		// 3.
	}

}
