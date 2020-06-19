package test.advice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	//�α׸� ����ϱ� ���� ��ü
	private Log logger =LogFactory.getLog(getClass());
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		//�޼ҵ��
		String methodName=joinPoint.getSignature().getName();
		
		if(logger.isDebugEnabled()) {//����� �����ΰ�� ����
			logger.debug("["+methodName+"]�޼ҵ�ȣ��!");
			Object[] args=joinPoint.getArgs();
			for(int i=0;i<args.length;i++) {
				logger.debug("["+i+"]��° �Ű����� : "+ args[i]);
			}
		}
		Object returnValue = joinPoint.proceed();
		if(logger.isDebugEnabled()) {//�� ����� ����� ���� ��� ����
			logger.debug("["+methodName+"]�޼ҵ� ���ϰ� : "+returnValue);
		}
		return returnValue;
	}
}
