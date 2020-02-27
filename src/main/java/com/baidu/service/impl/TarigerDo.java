package com.baidu.service.impl;

import com.baidu.service.CommonDo;

public class TarigerDo implements CommonDo{

	@Override
	public void speak() {
		System.out.println("hello world");
		
	}
	
	public void speakFight(String name){
		System.out.println("老虎打架"+name);
	}

}
