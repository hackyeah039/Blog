package com.jhta.spring16.aop;
//공통관심사항 -어드바이스
public class MyAdvice {
	public void test() {
		System.out.println("메소드들이 실행해야 할 공통기능 구현");
	}
	
	public void afterMethod() {
		System.out.println("더러운 꾸레");
	}
}
