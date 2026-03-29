package com.app.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ModelData {
	
	@Value("TEST")
	private String model;
	
	@Value("SAMPLE")
	private String code;

	public ModelData() {
		super();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "ModelData [model=" + model + ", code=" + code + "]";
	}
	
	
}
