package com.ty.hibernate_shopping_kart.service;

import com.ty.hibernate_shopping_kart.dao.UserDao;
import com.ty.hibernate_shopping_kart.dto.User;

public class UserService {
     
	public User saveUser(User user) {
		
		UserDao dao = new UserDao();
		return dao.saveUser(user);
		
	}
}
