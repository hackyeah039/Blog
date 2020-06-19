package test.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class QuizAdvice {
	@Pointcut("execution(public * test.dao..*(..))")
	public void timeTarget() {};
	
	@Around("timeTarget()")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args=joinPoint.getArgs();
		for(Object arg:args) {
			System.out.println(arg +"파라미터");
		}
		Object returnval=joinPoint.proceed();
		return returnval;
	}
}
