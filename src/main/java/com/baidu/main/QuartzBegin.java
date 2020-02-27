package com.baidu.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.baidu.entity.User;
import com.baidu.service.UserDao;



public class QuartzBegin {
	
	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	
	private static ApplicationContext applicationContext;
	
	public QuartzBegin(){}
	
	public QuartzBegin(ApplicationContext applicationContext){
		this.applicationContext=applicationContext;
	}

	public  void hello(){
			SimpleDateFormat simple=new SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
			Date date=new Date();
			String format = simple.format(date);
			logger.log(Level.INFO, format+"开始执行quzrtz");
			UserDao bean = applicationContext.getBean(UserDao.class);
			bean.updateBySeq("1");
			List<User> seachAll = bean.seachAll();
			for (User user : seachAll) {
				System.out.println(JSON.toJSONString(user));
			}
			String str="dfds";
			int parseInt = Integer.parseInt(str);
			List<User> seachBySeq = bean.seachBySeq("1");
			
		
			
			System.out.println(seachBySeq);
			System.out.println(applicationContext);
			System.out.println("执行结束******************************************");
			System.out.println("执行结束******************************************");
			System.out.println("执行结束******************************************");
			System.out.println("执行结束******************************************");
		
	}
}
