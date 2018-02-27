package com.sd.dao;

import java.util.List;

import com.sd.model.Pager;
import com.sd.model.User;

/**
 * 
 * @author Tency
 * 
 * Date 2016/11
 */
public interface UserDao {

	List<User> retrieve(String userName,String passWord);
	void add(User user);
	Pager<User> retrieveAll();
	User load(int id);
	void update(User user);
	void delete(int id);

}
