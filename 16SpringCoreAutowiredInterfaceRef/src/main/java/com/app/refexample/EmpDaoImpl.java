package com.app.refexample;

import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements IEmpDao {

	@Override
	public void save() {
		System.out.println("Reading DAO");
	}

}
