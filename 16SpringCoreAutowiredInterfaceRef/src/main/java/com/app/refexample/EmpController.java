package com.app.refexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpController  {
	
	@Autowired
	private IEmpService sob;
	
	public void getInfo() {
		sob.checkLogic();
		System.out.println("Reading from controller");
		
	}


}
