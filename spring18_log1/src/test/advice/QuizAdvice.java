package test.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//�޼ҵ� �����Ŀ� �޼ҵ帮�ϰ��� ����ϴ� �����̽���
//����� ����ǵ��� �غ�����(AgterReturningAdivce���)
public class QuizAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("QuizAdvice����");
		System.out.println("ȣ��Ǵ� �޼ҵ� : "+method);
		for(Object arg:args) {
			System.out.println("�Ķ���Ͱ��� :" +arg);
		}
		System.out.println("Ÿ��" +target);
		System.out.println(returnValue +"�޼ҵ� ���ϰ�");
		System.out.println("QuizAdvice��");
	}
	
}
