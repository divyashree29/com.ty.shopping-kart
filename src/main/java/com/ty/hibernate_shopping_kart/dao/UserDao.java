package com.ty.hibernate_shopping_kart.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hibernate_shopping_kart.dto.User;

public class UserDao {

	public User saveUser(User user) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		
		System.out.println("--------------done-----------");
		return user;
	}
	
}
