package test.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//Aspect : 공통기능(Advice) + 포인트컷 + 시점(메소드 실행전,후)
//그래서 이 3가지전부가 어노테이션으로 다 들어가야 함
@Aspect
public class ExecuteTimeAdvice {
	@Pointcut("execution(* test.quiz..*(..))")
	public void timeTarget() {}; //시간시점은 void로 ! 항상 리턴값 void로!
	
	@Around("timeTarget()") //timetarget around 일때 실행하겠다  
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime =System.currentTimeMillis();
		Object returnValue=joinPoint.proceed();
		long endTime=System.currentTimeMillis();
		String method=joinPoint.getSignature().getName();
		double t=(endTime-startTime)/1000.0;
		System.out.println(method +"수행시간  : "+t+ "초");
		return returnValue;
	}
}
