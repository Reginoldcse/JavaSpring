package ValuesInSetType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ValuesInSetType/Config.xml");
		Fruits fruits =(Fruits)context.getBean("frt");
		
		System.out.println(fruits.getColor());
		System.out.println(fruits.getTaste());
		System.out.println(fruits.getFruitname());
	}
}
