package com.baidu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.baidu.entity.User;
import com.baidu.service.UserDao;
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void seach(){
		List<User> seachAll = userDao.seachAll();
		for (User user : seachAll) {
			System.out.println(JSON.toJSONString(user));
		}
	}
}
