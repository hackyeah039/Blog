package com.jhta.spring17.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		Object[] args=joinPoint.getArgs();//파라미터
		Object returnValue=joinPoint.proceed();
	}
}
