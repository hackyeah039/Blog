package test.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
//�޼ҵ� �������Ŀ� ���۵Ǵ� �����̽�
public class PrintAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//�޼ҵ� �������� ������ ���//
		Object[] args=invocation.getArguments();
		String methodName= invocation.getMethod().getName();
		System.out.println("[ "+methodName+" ]�޼ҵ�� ���޵� �Ķ����==>");
		for(Object arg:args) {
			System.out.println(arg+",");
		}
		System.out.println();
		////////////////////
		Object returnValue=invocation.proceed();//�ٽɱ���� �޼ҵ� ȣ���ϱ�
		//�޼ҵ� �����Ŀ� ������ ���//
		System.out.println("�޼ҵ� ������ ���ϰ� : "+returnValue);
		////////////////////
		
		return returnValue;
	}
	
}
