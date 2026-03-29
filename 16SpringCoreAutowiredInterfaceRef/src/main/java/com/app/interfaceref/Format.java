package com.app.interfaceref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Format {
	
	@Autowired
	//@Qualifier("processImpl")
	private IProcess pob;
	
	public void printFormat() {
		pob.getProcessScope();
		System.out.println("FROM FORMAT");
		
	}

}
