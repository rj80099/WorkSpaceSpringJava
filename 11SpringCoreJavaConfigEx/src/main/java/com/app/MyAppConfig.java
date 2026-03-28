package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyAppConfig {
	
	@Autowired
	private Environment env;
	//one method = one object
	@Bean
	public DriverManager conObj() {
		DriverManager dm = new DriverManager();
		dm.setDriverClass(env.getProperty("my.driver"));
		dm.setUrl("my.url");
		return dm;
	}

}
