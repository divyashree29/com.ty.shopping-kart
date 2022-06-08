package com.ty.hibernate_shopping_kart.controller;

import com.ty.hibernate_shopping_kart.dto.User;
import com.ty.hibernate_shopping_kart.service.UserService;

public class UserController {

	public static void main(String[] args) {
		
		UserService userservice = new UserService();
		User user = new User();
		user.setId(1);
		user.setName("Bhavya");
		user.setEmail("bhav@gmail.com");
		user.setPassword("asdf");
		user.setPhone(1234567891l);
		userservice.saveUser(user);
	}
}
