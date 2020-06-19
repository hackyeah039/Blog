package test.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//메소드 실행후에 메소드리턴값을 출력하는 어드바이스를
//만들고 적용되도록 해보세요(AgterReturningAdivce상속)
public class QuizAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("QuizAdvice시작");
		System.out.println("호출되는 메소드 : "+method);
		for(Object arg:args) {
			System.out.println("파라미터값들 :" +arg);
		}
		System.out.println("타겟" +target);
		System.out.println(returnValue +"메소드 리턴값");
		System.out.println("QuizAdvice끝");
	}
	
}
