package com.sun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.dao.IUserDao;
import com.sun.pojo.User;
import com.sun.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	@Override
	public List<User> findUserList() {
		// TODO Auto-generated method stub
		
		return userDao.findUserList();
	}
	@Override
	public User findUserById() {
		// TODO Auto-generated method stub
		return userDao.findUserById();
	}

}
