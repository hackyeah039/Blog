package test.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	//로그를 출력하기 위한 객체
	private Log logger =LogFactory.getLog(getClass());
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		//메소드명
		String methodName=joinPoint.getSignature().getName();
		
		if(logger.isDebugEnabled()) {//디버그 레벨인경우 수행
			logger.debug("["+methodName+"]메소드호출!");
			Object[] args=joinPoint.getArgs();
			for(int i=0;i<args.length;i++) {
				logger.debug("["+i+"]번째 매개변수 : "+ args[i]);
			}
		}
		Object returnValue = joinPoint.proceed();
		if(logger.isDebugEnabled()) {//값 출력후 디버그 레벨 경우 수행
			logger.debug("["+methodName+"]메소드 리턴값 : "+returnValue);
		}
		return returnValue;
	}
}
