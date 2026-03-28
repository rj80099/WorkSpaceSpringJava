package com.app.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@ComponentScan(basePackages="com.app.scope")
@Configuration
public class MyAppConfig {
	
	//1 bean = 1 method
	@Bean
	//@Scope("prototype")
	@Scope("singleton")
	//@Lazy
	public Token t1() {
		return new Token();
	}

}
