package ValuesInReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {		

	ApplicationContext context=new ClassPathXmlApplicationContext("ValuesInReferenceType/Config.xml");
	
	Person person=(Person) context.getBean("person");
	
	System.out.println(person.getName());
	System.out.println(person.getAge());
	System.out.println(person.getAadharperson().getAadharnumber());
	System.out.println(person.getAadharperson().getAddress());
	}

}
