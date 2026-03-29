package com.app.spel;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process {
	
	//@Value("#{2+3}")
//	@Value("#{'Hello ABC'.length()}")  //String datatype
//	@Value("#{new java.util.Random().nextInt()}") //expression calling java method
//	@Value("#{T(java.lang.Math).abs(-9}") //for calling static use T -> type
    //@Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())}") //for calling static use T -> type
	//@Value("#{'Hello'.length()>0 ? 55 : 44}")
	//private int code;
	
	@Value("#{modelData.model.toLowerCase()}")
	private String code;
	
	//@Value("#{new java.util.Random().nextInt()>5?true:false}")
//	@Value("#{new java.util.Random().nextInt()>5}")
//	@Value("#{new java.util.Random().nextInt() le 5}")
	@Value("#{new java.util.Random().nextInt() gt 5}")
	private boolean isPresent;
	
	@Value("#{modelData.code.getBytes()}")
	private byte[] arr;
	
	@Value("#{modelData.code.toCharArray()}")
	private char[] data;

	@Override
	public String toString() {
		return "Process [code=" + code + ", isPresent=" + isPresent + ", arr=" + Arrays.toString(arr) + ", data="
				+ Arrays.toString(data) + "]";
	}
	

	

	

}
