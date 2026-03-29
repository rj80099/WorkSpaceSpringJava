package com.app.interfaceref;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class AdvanceProcessimp implements IProcess {

	@Override
	public void getProcessScope() {
		System.out.println("P2");

	}

}
