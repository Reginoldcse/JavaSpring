package ValuesInAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("ValuesInAttribute/Config.xml");
		Country country =(Country)context.getBean("country");
		System.out.println(country);
	}

}
