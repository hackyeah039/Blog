package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyAppConfig {
	@Bean(name="person")
	public Person person() {
		return new Person("홍길동",20);
	}
	@Bean(name="dao")
	public MembersDao dao() {
		return new MembersDao("아이디","비밀번호");
	}
}
