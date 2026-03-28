package my.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.app.Controller;
import my.app.Repository;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		
		//Repository repo = (Repository)ac.getBean("repository");
		Controller controller = (Controller)ac.getBean("controller");
		
		System.out.println(controller);

	}

}
