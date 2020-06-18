package com.jhta.spring17.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		Object[] args=joinPoint.getArgs();//�Ķ����
		Object returnValue=joinPoint.proceed();
	}
}
