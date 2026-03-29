package com.app.interfaceref;

import org.springframework.stereotype.Component;

@Component
public class ProcessImpl implements IProcess {

	@Override
	public void getProcessScope() {
		System.out.println("P1");
	}

}
