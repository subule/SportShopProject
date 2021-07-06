package com.cg.sports.service;

import org.springframework.stereotype.Service;

import com.cg.sports.entity.User;

@Service
public interface IUserService {
	
	public User signIn(User user);
	public User signOut(User user);
	public User changePassword(long id, User user);

}
