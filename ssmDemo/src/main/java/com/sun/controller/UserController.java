package com.sun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sun.pojo.User;
import com.sun.service.IUserService;

@Controller
@RequestMapping("/userManger")
public class UserController {



	@Autowired
	private IUserService userService;
	
	@RequestMapping("/findUserList")
	@ResponseBody
	public Map<String, Object> findUserList(){
		Map<String,Object> map = new HashMap<String,Object>();
		List<User>  user   = userService.findUserList();
		map.put("user", user);
		return map;
	}
	@RequestMapping("/findUserById")
	@ResponseBody
	public Map<String, Object> findUserById(){
		Map<String,Object> map = new HashMap<String,Object>();
		 User  user   = userService.findUserById();
		map.put("user", user);
		return map;
	}
	@RequestMapping("/index")
	@ResponseBody
	public String  index(){
		return "hello world";
	}
}
