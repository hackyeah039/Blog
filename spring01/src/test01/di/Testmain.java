package test01.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testmain {
	public static void main(String[] args) {
		Person pp = new Person("ȫ�浿",12);
		System.out.println(pp.getAge()+" : ����");
		System.out.println(pp.getName()+" : �̸�");
		System.out.println("Hello World!");//������ ��ü�� �����ؼ� �޾ƿ�
		//Bean�������Ͽ��� �����о�� (��������)��ü �����ϱ�
		ApplicationContext ac=new ClassPathXmlApplicationContext("test01/di/app01.xml");
		//�������� ������ ��ü ������
		Person pp2=(Person)ac.getBean("person");
		System.out.println("�̸� :" +pp2.getName());
		System.out.println("���� :" +pp2.getAge());
		Person pp3=(Person)ac.getBean("person1");
		System.out.println("�̸� :" +pp3.getName());
		System.out.println("���� :" +pp3.getAge());
	}
}
