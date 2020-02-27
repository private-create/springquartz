package com.baidu.test;

import java.util.List;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.alibaba.fastjson.JSON;
import com.baidu.entity.User;
import com.baidu.service.UserDao;

public class Test {

	public static void main(String[] args) {
		String path = Test.class.getClassLoader().getResource("spring_quartz.xml").getPath();
		System.out.println(path);
		ApplicationContext app=new FileSystemXmlApplicationContext(path);
		UserDao bean = app.getBean(UserDao.class);
		List<User> seachAll = bean.seachAll();
		for (User user : seachAll) {
			System.out.println(JSON.toJSONString(user));
		}
//		try {
//			bean.start();
//		} catch (SchedulerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
