package com.app.service;

public class ExcelExportService {
	
	private String fileName;
	private String mode;
	
	
	public void setup() {
		//lot of code..
		System.out.println("from init method");
	}
	
	public void clean() {
		//some code..
		System.out.println("from destroy method");
	}

	public ExcelExportService() {
		super();
		System.out.println("From Constructor");
	}
	
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		System.out.println("From Setter method");
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		System.out.println("From Setter method");
	}

	@Override
	public String toString() {
		return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
	}
	
	

	
	
	

}
