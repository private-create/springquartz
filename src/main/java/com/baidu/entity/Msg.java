package com.baidu.entity;

public class Msg {
	
	private String test;
	
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	public void init(){
		this.test="hello world init to";
	}
}
