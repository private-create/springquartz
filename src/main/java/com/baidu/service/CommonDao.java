package com.baidu.service;

import java.util.List;

public interface CommonDao <T> {
	
	public List<T> seachAll();
	
	public int insert(T t);
	
	public int update(T t);
	
	public int delete(String seq);
}
