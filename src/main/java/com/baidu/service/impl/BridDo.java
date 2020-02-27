package com.baidu.service.impl;

import com.baidu.service.CommonDo;

public class BridDo implements CommonDo{
	
	private String msg;
	@Override
	public void speak() {
		System.out.println("鸟的hello world的实现");
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void brid(){
		System.out.println("鸟接受"+msg+"信息");
	}

}
