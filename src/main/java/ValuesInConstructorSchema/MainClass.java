package ValuesInConstructorSchema;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ValuesInConstructorSchema/Config.xml");
		Student student =(Student)context.getBean("stu");
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		System.out.println(student.getSchooolname());
		System.out.println(student);
	
	}

}
