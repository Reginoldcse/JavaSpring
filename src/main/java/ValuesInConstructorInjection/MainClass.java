package ValuesInConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("/ValuesInConstructorInjection/Config.xml");
		Laptop laptop=(Laptop)context.getBean("lap");
	
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getModel());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getStorage());
		
	}

}
