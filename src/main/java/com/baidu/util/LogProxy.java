package com.baidu.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogProxy implements InvocationHandler{
	private Logger logger=Logger.getLogger(LogProxy.class.getName());
	private Object obj;
	public Object bind(Object obj){
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
		
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result=null;
		try {
			logger.log(Level.INFO, "注释日志");
			result=method.invoke(obj, args);
			logger.log(Level.INFO, "注入日志完成");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void testLog(String name){
		logger.log(Level.INFO, "注释日志");
	}

}
