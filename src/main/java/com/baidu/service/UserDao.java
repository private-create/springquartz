package com.baidu.service;

import java.util.List;

import com.baidu.entity.User;

public interface UserDao extends CommonDao<User>{
	
	public List<User> seachBySeq(String userSeq);
	
	public void updateBySeq(String userSeq);
}
