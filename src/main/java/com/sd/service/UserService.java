package com.sd.service;

import java.util.List;

import com.sd.model.Pager;
import com.sd.model.User;


/**
 * 
 * @author Tency
 * 
 * Date 2016/11
 */
public interface UserService {

	List<User> checkLogin(String userName,String passWord);
	void addUser(User user);
	User showUser(int id);
	void updateUser(User user);
	void deleteUser(int id);
	Pager<User> userList();
}
