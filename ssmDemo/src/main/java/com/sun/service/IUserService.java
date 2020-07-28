package com.sun.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.sun.pojo.User;
@Repository
public interface IUserService {

	List<User> findUserList();

	User findUserById();

}
