package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.ExcelExportService;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		ExcelExportService service =  ac.getBean("eobj", ExcelExportService.class);
		
		System.out.println(service);
		ac.close();
		

	}

}
   