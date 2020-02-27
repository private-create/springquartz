package com.baidu.util;

import java.lang.reflect.Method;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogMethod implements MethodBeforeAdvice,AfterReturningAdvice{
	
	private Logger logger=Logger.getLogger(this.getClass().getName());
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		logger.log(Level.INFO, "方法开始执行");
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		logger.log(Level.INFO, "方法执行结束");
		
	}
	
	public void rghit(String name){
		logger.log(Level.INFO, "方法开始执行"+name);
	}

}
