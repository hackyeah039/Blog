package com.jhta.spring16.aop;

import org.aspectj.lang.ProceedingJoinPoint;
//공통기능 -메소드 싱행전후에 동작
public class LogAdvice {
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable{ //프로시져를 가지고있는 메소드를 호출하는것  proceedingjoin~~ 
		//메소드 실행전에 해야할 기능 구현 /////////////////
		Object[] args=joinPoint.getArgs();//메소드로 전달된 파라미터
		for(Object arg:args) {
			System.out.println("매개변수 : " + arg);
		}
		///////////////////////////////////
		Object returnValue= joinPoint.proceed(); //핵심기능 메소드 호출 ,,핵심기능을 갖진 메소드가 리턴한 값 
		///////////메소드 실행후에 해야할 기능 구현 //////////
		System.out.println(" 메소드 동작완료 !");
		System.out.println(" 메소드에서 리턴된 값 : "+returnValue);
		/////////////////////////////////////////
		return returnValue;
	}
}
