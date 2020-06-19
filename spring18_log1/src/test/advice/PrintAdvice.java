package test.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//메소드 실행전후에 동작되는 어드바이스
public class PrintAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//메소드 실행전에 수행할 기능//
		Object[] args=invocation.getArguments();
		String methodName= invocation.getMethod().getName();
		System.out.println("[ "+methodName+" ]메소드로 전달된 파라미터==>");
		for(Object arg:args) {
			System.out.println(arg+",");
		}
		System.out.println();
		////////////////////
		Object returnValue=invocation.proceed();//핵심기능의 메소드 호출하기
		//메소드 실행후에 수행할 기능//
		System.out.println("메소드 수행후 리턴값 : "+returnValue);
		////////////////////
		
		return returnValue;
	}
	
}
