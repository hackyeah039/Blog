package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyAppConfig {
	@Bean(name="person")
	public Person person() {
		return new Person("ȫ�浿",20);
	}
	@Bean(name="dao")
	public MembersDao dao() {
		return new MembersDao("���̵�","��й�ȣ");
	}
}
