package com.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vr")
public class ViewResolver {
	
	@Value("redis")
	private String data;
	
	@Value("cache")
	private String value;

	@Override
	public String toString() {
		return "ViewResolver [data=" + data + ", value=" + value + "]";
	}
	
	
	
	
	
	

}
