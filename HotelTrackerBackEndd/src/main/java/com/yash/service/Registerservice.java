package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.model.User;
import com.yash.repository.Registerrepository;
import com.yash.service.Registerservice;
@Service
public class Registerservice{
	
	@Autowired
	Registerrepository rr;
	
	public User saveUser(User user)
	{
	return rr.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		
		return rr.findByEmailId(email);
	}
	
    public User fetchUserByEmailIdAndPassword(String email, String password) {
		
		return rr.findByEmailIdAndPassword(email, password);
	}
}
