package test01;
   
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
   
public class TestMain {
   	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("test01/test01.xml");
		MembersController mc =(MembersController)ac.getBean("mController");
		mc.execute();
	}
}
