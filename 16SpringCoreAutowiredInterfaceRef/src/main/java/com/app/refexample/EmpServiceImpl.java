package com.app.refexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmpServiceImpl implements IEmpService {
	
	@Autowired
	private IEmpDao dao;

	@Override
	public void checkLogic() {
	dao.save();
	System.out.println("Reading from service");

	}

}
