package com.baidu.service.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log implements MethodInterceptor{
	
	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	public void getLog(){
		logger.log(Level.INFO, "开始记录日志");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.log(Level.INFO, "开始记录日志");
		Object proceed = invocation.proceed();
		logger.log(Level.INFO, "记录日志结束");
		return proceed;
	}
}
