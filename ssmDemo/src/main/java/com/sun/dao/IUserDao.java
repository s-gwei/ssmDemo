package com.sun.dao;

import java.util.List;



import com.sun.pojo.User;

public interface IUserDao {
	
	
	List<User> findUserList();

	User findUserById();
}
