package ValuesInListType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ValuesInListType/Config.xml");
		Ipl ipl =(Ipl)context.getBean("ipl1");
		System.out.println(ipl.getTeamname());
		System.out.println(ipl.getColor());
		System.out.println(ipl.getPlayers());
	
	}

}
