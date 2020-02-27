package com.baidu.service.impl;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.baidu.entity.Msg;
import com.baidu.service.CommonDo;
@Component
public class DogDo implements CommonDo{
	
	private Logger logger= Logger.getLogger(DogDo.class.getName());
	
	private Msg test;

	private String msg;
	@Override
	public void speak() {
		System.out.println("狗的hello world 实现");
	}
	public DogDo(){}
	
	public DogDo(String msg){
		this.msg=msg;
	}
	
	public Msg getTest() {
		return test;
	}
	public void setTest(Msg test) {
		this.test = test;
	}
	
	public void dog(String name){
		System.out.println("狗狗接受"+msg+"信息"+name);

	}
	
	public void init(){
		logger.log(Level.INFO, "初始化log4j");
		System.out.println("log4j");
	}
}
