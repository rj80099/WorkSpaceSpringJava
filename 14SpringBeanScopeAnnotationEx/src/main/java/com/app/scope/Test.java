package com.app.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Token tok1= ac.getBean("t1", Token.class);
		System.out.println(tok1 +":: "+ tok1.hashCode());
		Token tok2= ac.getBean("t1", Token.class);
		System.out.println(tok2 +":: "+ tok2.hashCode());
		
		

	}

}
