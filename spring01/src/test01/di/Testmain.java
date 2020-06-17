package test01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {
	public static void main(String[] args) {
		Person pp = new Person("홍길동",12);
		System.out.println(pp.getAge()+" : 나이");
		System.out.println(pp.getName()+" : 이름");
		System.out.println("Hello World!");//기존에 객체를 생성해서 받아옴
		//Bean설정파일에서 정보읽어와 (스프링이)객체 생성하기
		ApplicationContext ac=new ClassPathXmlApplicationContext("test01/di/app01.xml");
		//스프링이 생성한 객체 얻어오기
		Person pp2=(Person)ac.getBean("person");
		System.out.println("이름 :" +pp2.getName());
		System.out.println("나이 :" +pp2.getAge());
		Person pp3=(Person)ac.getBean("person1");
		System.out.println("이름 :" +pp3.getName());
		System.out.println("나이 :" +pp3.getAge());
	}
}
