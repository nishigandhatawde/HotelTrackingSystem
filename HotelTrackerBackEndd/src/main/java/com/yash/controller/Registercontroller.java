package com.yash.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.User;
import com.yash.service.Registerservice;

@RestController
@CrossOrigin("*")
public class Registercontroller {
	
	@Autowired
	Registerservice rs;
	
	@PostMapping("/registeruser")
	public User registerUser(@RequestBody User user) throws Exception
	{
		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
		User userobj =	rs.fetchUserByEmailId(tempEmailId);
		if(userobj != null) {
			throw new Exception("user with"+ tempEmailId +"is already exist");
			
		}
		}
		
		User userObj = null;
		
		userObj=	rs.saveUser(user);
		
		return userObj;
	}

	@PostMapping("/login")

	public User loginUser(@RequestBody User user) throws Exception {
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword ();
		User userobj = null;
		if(tempEmailId != null && tempPass != null) {
			userobj = rs.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userobj == null) {
			throw new Exception("Bad credentials");
		}
		
		return userobj;
	}
}
