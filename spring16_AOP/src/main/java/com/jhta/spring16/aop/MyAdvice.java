package com.jhta.spring16.aop;
//������ɻ��� -�����̽�
public class MyAdvice {
	public void test() {
		System.out.println("�޼ҵ���� �����ؾ� �� ������ ����");
	}
	
	public void afterMethod() {
		System.out.println("������ �ٷ�");
	}
}
